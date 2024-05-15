package com.learning.Mapping.OneToMany;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Test2 {

	public static void main(String[] args) {
		SessionFactory factory = new Configuration()
				.configure("hibernate.cfg.xml")
				.buildSessionFactory();
		Session session = factory.openSession();
		
		System.out.println("Loading Worker object");
		Worker worker = session.get(Worker.class, 1);
		System.out.println(worker.getWorkerName());
	    for(Account a1:worker.getAccounts()){
	    	System.out.print(a1.getAccountNumber()+"  ");
	    }
	    System.out.println();
		
		System.out.println("_____________________");
		System.out.println("Loading account object");
		Account account = session.get(Account.class, 2);
        System.out.println(account.getAccountNumber()+" "+account.getWorker().getWorkerName());
	}

}
