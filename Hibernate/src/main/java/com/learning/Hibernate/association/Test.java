package com.learning.Hibernate.association;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Test {

	public static void main(String[] args) {
		Address address = new Address("Bangalore","Karnataka");
		
		Employee emp = new Employee("Harsh",address);
		
		SessionFactory factory = new Configuration()
				.configure("hibernate.cfg.xml")
				.buildSessionFactory();
		
		Session session = factory.openSession();
		session.beginTransaction();
		session.save(emp);
		session.getTransaction().commit();
		session.close();
		System.out.println("employee saved successfully");
		
		

	}

}
