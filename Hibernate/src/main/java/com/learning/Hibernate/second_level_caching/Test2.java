package com.learning.Hibernate.second_level_caching;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Test2 {

	public static void main(String[] args) {
		SessionFactory factory = new Configuration()
				.configure()
				.buildSessionFactory();
		
		Session s1 = factory.openSession();
		Student s = s1.get(Student.class, 101);
		System.out.println(s);
		s1.close();
		System.out.println("__________________________");
		System.out.println();
		
		Session s2 =factory.openSession();
		Student st = s2.get(Student.class, 101);
		System.out.println(st);
		
		
		
		

	}

}
