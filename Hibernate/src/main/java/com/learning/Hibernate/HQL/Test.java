package com.learning.Hibernate.HQL;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Test {

	public static void main(String[] args) {
		Product p1 = new Product(101,"Laptop",5000);
		Product p2 = new Product(102,"Mobile",3000);
		Product p3 = new Product(103,"TV",1000);
		Product p4 = new Product(104,"WashingMachine",8000);
		Product p5 = new Product(105,"Tablets",7000);
		Product p6 = new Product(106,"Desktop",10000);
		
		SessionFactory factory = new Configuration()
				.configure()
				.buildSessionFactory();
		
		Session session = factory.openSession();
		session.beginTransaction();
		session.save(p1);
		session.save(p2);
		session.save(p3);
		session.save(p4);
		session.save(p5);
		session.save(p6);
		session.getTransaction().commit();
		session.close();
	}

}
