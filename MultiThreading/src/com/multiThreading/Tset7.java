package com.multiThreading;

class SharedData{
	public static synchronized void m1()
	{
		System.out.println("______________________________________");
		System.out.println("m1() start execution");
		for(int i=1;i<=5;i++){
			System.out.println("Current running thread :"+Thread.currentThread().getName());
		}
		System.out.println("m1() completed");
		System.out.println("__________________________________________");
	}
	
//	public void m1()
//	{
//		System.out.println("______________________________________");
//		System.out.println("m1() start execution");
//		synchronized (this) {
//			for(int i=1;i<=5;i++){
//				System.out.println("Current running thread :"+Thread.currentThread().getName());
//			}
//		}
//		System.out.println("m1() completed");
//		System.out.println("__________________________________________");
//	}
}

class Worker1 extends Thread{
	private SharedData sharedData;
	Worker1(SharedData sharedData){
		this.sharedData = sharedData;
	}
	public void run(){
		this.sharedData.m1();
	}
}

class Worker2 extends Thread{
	private SharedData sharedData;
	Worker2(SharedData sharedData){
		this.sharedData = sharedData;
	}
	public void run(){
		this.sharedData.m1();
	}
}

class Worker3 extends Thread{
	private SharedData sharedData;
	Worker3(SharedData sharedData){
		this.sharedData = sharedData;
	}
	public void run(){
		this.sharedData.m1();
	}
}



public class Tset7 {

	public static void main(String[] args) {
		
       SharedData sharedData = new SharedData();
       SharedData sharedData2 = new  SharedData();
       Worker1 worker1 = new Worker1(sharedData);
       Worker2 worker2 = new Worker2(sharedData2);
       //Worker3 worker3 = new Worker3(sharedData);
       
       worker1.setName("W1");
       worker2.setName("W2");
      // worker3.setName("W3");
       
       worker1.start();
       worker2.start();
      // worker3.start();
       
       
	}

}
