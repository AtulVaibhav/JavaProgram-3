package com.Inheritance;

class Vehicle{
	protected String engineType="petrol-engine";
}

class FourWheeler extends Vehicle{
	protected int numberOfWheels = 4;
}

class Car extends FourWheeler{
	protected String color = "black";
}


public class MultilevelInheritance {

	public static void main(String[] args) {
		Car car = new Car();
		System.out.println(car.engineType);
		System.out.println(car.numberOfWheels);
		System.out.println(car.color);

	}

}
