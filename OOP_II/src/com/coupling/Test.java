package com.coupling;

public class Test {

	public static void main(String[] args) {
		Airtel airtel = new Airtel();
		Idea idea = new Idea();
		Jio jio = new Jio();
	
		Mobile mobile = new Mobile(jio);
		System.out.println(mobile.getServices());
		

	}

}
