package com.multiThreading;


class X1 extends Thread{
	public void run(){
		for(int i=1;i<=3;i++){
			System.out.println("Current thread :"+Thread.currentThread().getName());
			
		}
	}
}

class Y1 extends Thread{
	public void run(){
		for(int i=1;i<=3;i++){
			System.out.println("Current thread :"+Thread.currentThread().getName());
			
		}
	}
}

public class Test4 {

	public static void main(String[] args) {
		System.out.println("Priority of main thread "+Thread.currentThread().getPriority());
		X1 x = new X1();
		Y1 y = new Y1();
		
		x.setName("Thread-A");
		y.setName("Thread-B");
		
		System.out.println("Priority of thread X :"+x.getPriority());
		System.out.println("Priority of thread Y :"+y.getPriority());
		
		x.setPriority(Thread.MIN_PRIORITY);
		y.setPriority(Thread.MAX_PRIORITY);
		
		System.out.println("After setting priority :");
		System.out.println("Priority of thread X :"+x.getPriority());
		System.out.println("Priority of thread Y :"+y.getPriority());
		
		x.start();
		y.start();

	}

}
