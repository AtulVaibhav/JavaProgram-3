package com.learning;

class Pen{
	Pen(){
		System.out.println("Current value of this--->"+this.hashCode());
	}
}

public class ThisKeyword {

	public static void main(String[] args) {
		Pen p1 = new Pen();
		System.out.println("Current value of p1--->"+p1.hashCode());
		
		System.out.println("_________________________________________");
		Pen p2 = new Pen();
		System.out.println("Current value of p2--->"+p2.hashCode());

	}

}
