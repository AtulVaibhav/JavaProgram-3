package com.encapsulation;

class Car{
	private final int  wheels=1200;
	
//	public void setWheels(int wheels){
//		this.wheels = wheels;
//	}
	
	public int getWheels(){
		return this.wheels;
	}
}

public class Test {

	public static void main(String[] args) {
		Car c = new Car();
//		System.out.println(c.wheels);
//		c.wheels = 10;
//		System.out.println(c.wheels);
		
//		c.setWheels(200);
		System.out.println(c.getWheels());

	}

}
