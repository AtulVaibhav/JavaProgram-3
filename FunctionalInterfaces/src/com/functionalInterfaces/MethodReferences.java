package com.functionalInterfaces;

import java.util.function.Function;

@FunctionalInterface
interface Example2{
	//void m1();
	String reverse(String str);
}

class Impl{
	public void show(){
		System.out.println("show() method is called");
	}
	
	public static void display(){
		System.out.println("display() called");
	}
}


public class MethodReferences {

	public static void main(String[] args) {
//		Impl obj = new Impl();
//		Example2 e2 = obj::show;
//        e2.m1();
		
//		Example2 e3 = Impl::display;
//		e3.m1();
		
		//Example2 e4 = (str)->{return new StringBuffer::reverse(str).toString();};
	}

}
