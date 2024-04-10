package com.abstraction;

interface A1{
	void m1();
	
}

interface A2{
	void m1();
	
}

class AImpl implements A1,A2{
	public void m1(){
		System.out.println("Hello");
	}
}

public class Test3 {

	public static void main(String[] args) {
		AImpl obj = new AImpl();
		obj.m1();

	}

}
