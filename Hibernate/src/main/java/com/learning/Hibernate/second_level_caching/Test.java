package com.learning.Hibernate.second_level_caching;

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
		
		Student s1 = new Student();
		s1.setStudentId(101);
		s1.setStudentName("Harsh");
		
		session.save(s1);
		session.getTransaction().commit();
		
	}

}
