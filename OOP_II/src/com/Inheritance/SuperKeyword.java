package com.Inheritance;

class Base{
	Base(){
		System.out.println("Parent class constructor called");
	}
}
class Derived extends Base{
	Derived(){
		System.out.println("Child class constructor called");
	}
}


public class SuperKeyword {

	public static void main(String[] args) {
		Derived derived = new Derived();
		

	}

}
