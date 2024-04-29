package com.learning.Hibernate.primaryKeyGeneration;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.learning.Hibernate.Product;

public class Main {

	public static void main(String[] args) {
		Course c1 = new Course("Java");
		Course c2 = new Course("Web");
		Configuration cfg = new Configuration();
		SessionFactory factory = cfg.configure("hibernate.cfg.xml")
				                .buildSessionFactory();
		
		//create session object
		Session session =factory.openSession();
		
		//getting transaction object
		session.beginTransaction();
		
		//perform db operation
		session.save(c1);
		session.save(c2);
		session.getTransaction().commit();
		

	
	}

}
