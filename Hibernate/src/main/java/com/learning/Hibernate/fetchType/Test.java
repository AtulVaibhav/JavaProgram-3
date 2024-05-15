package com.learning.Hibernate.fetchType;

import java.util.HashSet;
import java.util.Set;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Test {

	public static void main(String[] args) {
		Product p1 = new Product();
		p1.setProductName("p1");
		
		Product p2 = new Product();
		p2.setProductName("p2");
		
		Product p3 = new Product();
		p3.setProductName("p3");
		
		Set<Product> set = new HashSet<>();
		set.add(p1);
		set.add(p2);
		set.add(p3);
		
		Category c1 = new Category();
		c1.setCategoryName("ElectronicGoods");
		
		c1.setProducts(set);
		
		p1.setCategory(c1);
		p2.setCategory(c1);
		p3.setCategory(c1);
		
		SessionFactory factory = new Configuration()
				 .configure()
				 .buildSessionFactory();
		
		Session session = factory.openSession();
		session.beginTransaction();
		session.save(c1);
		session.getTransaction().commit();
		session.close();
		System.out.println("Category saved successfully");

	}

}
