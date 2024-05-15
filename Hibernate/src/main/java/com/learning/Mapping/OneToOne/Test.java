package com.learning.Mapping.OneToOne;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Test {

	public static void main(String[] args) {
		User u1 = new User();
		u1.setUserName("user1");
		
		Vehicle v1 = new Vehicle();
		v1.setVehicleRegistrationNumber("r1");
		
		u1.setVehicle(v1);
		v1.setUser(u1);
		
		
		SessionFactory factory = new Configuration()
				.configure("hibernate.cfg.xml")
				.buildSessionFactory();
		Session s1 = factory.openSession();
		s1.beginTransaction();
		s1.save(u1);
		s1.save(v1);
		
		s1.getTransaction().commit();
		s1.close();

	}

}
