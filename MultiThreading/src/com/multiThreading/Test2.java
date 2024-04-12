package com.multiThreading;


class A extends Thread{
	public void m2(){
		System.out.println("Current running thread executing m2():"+Thread.currentThread().getName());
	}
	public void run(){
		m1();
	}
	public void m1(){
		System.out.println("Current running thread executing m1() :"+Thread.currentThread().getName());
		;
		m2();
	}
}

class X extends Thread{
	public void run(){
		System.out.println("Current running thread executing run() :"+Thread.currentThread().getName());
		;
	}
}
public class Test2 {

	public static void main(String[] args) {
		System.out.println("Current running thread executing main() :"+Thread.currentThread().getName());
		;
		A a = new A();
		a.start();
		
		X x = new X();
		x.start();

	}

}
