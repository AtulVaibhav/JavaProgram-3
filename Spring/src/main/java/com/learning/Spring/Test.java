package com.learning.Spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

interface Network{
	String getNetworkName();
}

class Airtel implements Network{
	public String getNetworkName(){
		return "Airtel-Services";
	}
}

class JIO implements Network{
	public String getNetworkName(){
		return "JIO-Services";
	}
}

class Sim {
	private Network network;

	public Sim(Network network) {
		super();
		this.network = network;
	}
	public String getNetwork(){
		return  this.network.getNetworkName();
	}
}
public class Test {

	public static void main(String[] args) {
//		Airtel airtel = new Airtel();
//		JIO jio = new JIO();
//		Sim sim = new Sim(airtel);
//		System.out.println(sim.getNetwork());
		
		//creating ioc container
		ApplicationContext context = 
				new ClassPathXmlApplicationContext("application-context.xml");
		Sim obj = context.getBean("network",Sim.class);
		System.out.println(obj.getNetwork());
	}

}
