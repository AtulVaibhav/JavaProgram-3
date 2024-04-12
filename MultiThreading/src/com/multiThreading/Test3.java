package com.multiThreading;


class B implements  Runnable{
	public void run(){
		m1();
	}
	public void m1(){
		System.out.println("Current running thread executing m1() :"+Thread.currentThread().getName());
		;
	}
}
public class Test3 {

	public static void main(String[] args) {
		System.out.println("Current running thread executing main() :"+Thread.currentThread().getName());
		;	
		B b = new B();
		Thread thread = new Thread(b);
		thread.start();

	}

}
