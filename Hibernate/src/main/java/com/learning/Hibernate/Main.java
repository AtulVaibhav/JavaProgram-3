package com.learning.Hibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Main {

	public static void main(String[] args) {
		
		Product product = new Product(101,"Laptop");
		Configuration cfg = new Configuration();
		SessionFactory factory = cfg.configure("hibernate.cfg.xml")
				                .buildSessionFactory();
		
		//create session object
		Session session =factory.openSession();
		
		//getting transaction object
		session.beginTransaction();
		
		//perform db operation
		session.save(product);
		session.getTransaction().commit();
		

	}

}
