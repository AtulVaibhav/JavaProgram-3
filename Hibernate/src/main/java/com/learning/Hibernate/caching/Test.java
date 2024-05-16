package com.learning.Hibernate.caching;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Test {

	public static void main(String[] args) {
		SessionFactory factory = new Configuration()
				.configure()
				.buildSessionFactory();
		
		Session session = factory.openSession();
		session.beginTransaction();
		
		Employee e1 = new Employee();
		e1.setEmpId(101);
		e1.setEmpName("Harsh");
		
		session.save(e1);
		session.getTransaction().commit();
		

	}

}
