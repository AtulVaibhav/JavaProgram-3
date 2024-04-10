package com.polymorphism;

class Parent{
	public int m1(int a){
		return a*a;
	}
}

class Child extends Parent{
	
	@Override
	public int m1(int a){
		return (int)Math.pow(a, a);
	}
	
}
public class MethodOverriding {

	public static void main(String[] args) {
		Parent p = new Parent();
		System.out.println(p.m1(3));
		
		Child ch = new Child();
		System.out.println(ch.m1(3));

	}

}
