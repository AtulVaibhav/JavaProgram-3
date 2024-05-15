package com.learning.Mapping.OneToMany;

import java.util.HashSet;
import java.util.Set;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Test {

	public static void main(String[] args) {
		Worker w1 = new Worker();
		w1.setWorkerName("Amit");
		
		Worker w2 = new Worker();
		w2.setWorkerName("Varun");
		
		Account a1 = new Account();
		a1.setAccountNumber("SBI123");
		
		Account a2 = new Account();
		a2.setAccountNumber("PNB123");
		
		Account a3 = new Account();
		a3.setAccountNumber("ICICI567");
		
		Account a4 = new Account();
		a4.setAccountNumber("SBI987");
		
		Account a5 = new Account();
		a5.setAccountNumber("PNB768");
		
		Set<Account> s1 = new HashSet<>();
		s1.add(a1);
		s1.add(a2);
		s1.add(a3);
		
		Set<Account> s2 = new HashSet<>();
		s2.add(a4);
		s2.add(a5);
		
		w1.setAccounts(s1);
		w2.setAccounts(s2);
		
		a1.setWorker(w1);
		a2.setWorker(w1);
		a3.setWorker(w1);
		
		a4.setWorker(w2);
		a5.setWorker(w2);
		
		
		SessionFactory factory = new Configuration()
				.configure("hibernate.cfg.xml")
				.buildSessionFactory();
		
		Session session  = factory.openSession();
		session.beginTransaction();
		session.save(w1);
		session.save(w2);
		session.getTransaction().commit();
		session.close();
		
		System.out.println("Object saved");
		
	}

}
