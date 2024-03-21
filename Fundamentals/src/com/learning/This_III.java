package com.learning;

class A1{
	A1(){
		this(20);
		System.out.println("default constructor called");
		
	}
	
	A1(int a){
		System.out.println("parameterized constructor called");
	}
}
public class This_III {

	public static void main(String[] args) {
		A1 a = new A1();

	}

}
