package com.learning.Mapping.OneToOne;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Test2 {

	public static void main(String[] args) {
		SessionFactory factory = new Configuration()
				.configure("hibernate.cfg.xml")
				.buildSessionFactory();
		
		Session session  = factory.openSession();
		System.out.println("Loading User object");
		User user = session.get(User.class,1);
		System.out.println(user.getUserName());
		System.out.println(user.getVehicle().getVehicleRegistrationNumber());
		System.out.println("___________________________________________________");
		
		System.out.println("Loading Vehicle object");
		Vehicle vehicle = session.get(Vehicle.class, 1);
		System.out.println(vehicle.getVehicleRegistrationNumber());
		System.out.println(vehicle.getUser().getUserName());
		
		session.close();

	}

}
