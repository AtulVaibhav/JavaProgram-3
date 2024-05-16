package com.learning.Hibernate.lifeCycle;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Test {

	public static void main(String[] args) {
		Vehicle v1 = new Vehicle("santro","ml34rg");
		System.out.println("Object is in transient state");
		SessionFactory factory = new Configuration()
				.configure()
				.buildSessionFactory();
		
		Session session = factory.openSession();
		session.beginTransaction();
		session.save(v1);
		session.getTransaction().commit();
		System.out.println("Object is in persistent state");
		Vehicle storedVehicle = session.get(Vehicle.class, 1);
		storedVehicle.setVehicleName("RangeRover");
		session.beginTransaction();
		session.update(storedVehicle);
		session.getTransaction().commit();
		System.out.println(storedVehicle);
		System.out.println("object updated");
		
		session.close();
		storedVehicle.setVehicleName("LandRover");
		System.out.println(storedVehicle);
		System.out.println("object is in detached state");
		Session s2= factory.openSession();
		s2.beginTransaction();
		s2.update(storedVehicle);
	    s2.getTransaction().commit();
	    System.out.println("object is in persistent state");
		

	}

}
