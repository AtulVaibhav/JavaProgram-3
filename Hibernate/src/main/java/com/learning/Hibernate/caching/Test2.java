package com.learning.Hibernate.caching;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Test2 {

	public static void main(String[] args) {
		SessionFactory factory = new Configuration()
				.configure()
				.buildSessionFactory();
		
		Session session = factory.openSession();
		Employee emp = session.get(Employee.class, 101);
		System.out.println(emp);
		Employee emp1 = session.get(Employee.class, 101);
		System.out.println(emp1);
		session.close();
		System.out.println("_____________________________");
		System.out.println();
		System.out.println("using new  session");
		Session session2 = factory.openSession();
		Employee emp2 = session2.get(Employee.class, 101);
		System.out.println(emp2);

	}

}
