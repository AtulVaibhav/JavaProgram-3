package com.Inheritance;

class Parent{
	int a=10;
	public int b = 20;
	private int c  = 30;
	protected int d = 40;
}

class Child extends Parent{
	public void show(){
		System.out.println(a);
		System.out.println(b);
		System.out.println(d);
	}
}

public class SingleInheritance {

	public static void main(String[] args) {
		Child ch = new Child();
		ch.show();

	}

}
