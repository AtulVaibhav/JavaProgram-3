package com.abstraction;

interface A{
	//public and abstract
	void m1();
}
interface  B{
	void m2();
}
interface C extends A,B{
	public default void m3(){
		System.out.println("hello from default method");
	}
}

class X implements C{
	public void m1(){
		System.out.println("Hello");
	}
	
	public void m2(){
		System.out.println("Hi");
	}
	
}

public class Test2 {

	public static void main(String[] args) {
		//A a = new A();
		X obj = new X();
		obj.m1();
		obj.m2();
		obj.m3();

	}

}
