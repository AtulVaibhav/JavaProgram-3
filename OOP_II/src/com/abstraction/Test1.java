package com.abstraction;

 abstract class Company{
	 int a = 10;
	
	 public abstract void m1();
	 public void m2(){
		 System.out.println("Hello from m2()");
	 }
}
class ABC extends Company{
	public void m1(){
		System.out.println("hi from m1()");
	}
	//public abstract void m3();
	
}

public class Test1 {

	public static void main(String[] args) {
		//Company company = new Company();
        ABC obj = new ABC();
        obj.m1();
        obj.m2();
	}

}
