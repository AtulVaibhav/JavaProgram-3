package com.learning;

public class StaticVariable {
    static int b=20;
	public static void main(String[] args) {
		//access.1.Using className
		//System.out.println(StaticVariable.b);
		
		//access:using object
		
		StaticVariable obj1 = new StaticVariable();
		//System.out.println(obj1.b);
		StaticVariable obj2 = new StaticVariable();
		
		System.out.println("Before Modification");
		System.out.println(obj1.b);
		System.out.println(obj2.b);
		
		System.out.println("_____________________________");
		System.out.println("After Modification");
		obj1.b = 100;
		
		System.out.println(obj1.b);
		System.out.println(obj2.b);
		

	}

}
