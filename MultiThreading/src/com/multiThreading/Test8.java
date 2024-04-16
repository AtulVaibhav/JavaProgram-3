package com.multiThreading;
class Stationary{
	public static final String resource1 = "PEN";
	public static final String resource2 = "PAPER";
}


class W1 extends Thread{
	public void run(){
		synchronized(Stationary.resource1){
			System.out.println("Worker1 thread acquired lock of pen.Waiting for paper");
		
		    synchronized (Stationary.resource2) {
				System.out.println("Worker1 thread acquired lock of paper");
			}
		    System.out.println("Writing process completed...");
		}
	}
}
class W2 extends Thread{
	public void run(){
		synchronized(Stationary.resource2){
			System.out.println("Worker2 thread acquired lock of paper.Waiting for pen");
		
		    synchronized (Stationary.resource1) {
				System.out.println("Worker2 thread acquired lock of pen");
			}
		    System.out.println("Writing process completed...");
		}
	}
}

public class Test8 {

	public static void main(String[] args) {
		W1 t1 = new W1();
		W2 t2 = new W2();
		t1.start();
		t2.start();

	}

}
