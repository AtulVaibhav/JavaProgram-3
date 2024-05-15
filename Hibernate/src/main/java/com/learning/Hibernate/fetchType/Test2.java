package com.learning.Hibernate.fetchType;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Test2 {

	public static void main(String[] args) {
		SessionFactory factory = new Configuration()
				 .configure()
				 .buildSessionFactory();
		
		Session session = factory.openSession();
		
		//lazy loading
//		Category c = session.get(Category.class, 1);
//		System.out.println(c.getCategoryName());
//		System.out.println(c.getProducts().size());
		
		//eager loading
		Category c = session.get(Category.class, 1);
		System.out.println(c.getCategoryName());

	}

}
