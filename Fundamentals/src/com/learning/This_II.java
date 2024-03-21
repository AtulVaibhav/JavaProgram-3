package com.learning;

class A{
	int a=10;
	public void m1(){
		int a=20;
		System.out.println(this.a);
	}
	public void n1(){
		this.m1();
	}
}
public class This_II {

	public static void main(String[] args) {
		A a = new A();
		a.n1();

	}

}
