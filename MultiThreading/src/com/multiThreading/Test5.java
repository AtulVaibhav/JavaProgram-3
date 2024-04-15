package com.multiThreading;

class DoTask extends Thread{
	public void run(){
		for(int i=1;i<=3;i++){
			System.out.println(Thread.currentThread().getName()+" perform "+i+"task");
		}
	}
}

class DoTask2 extends Thread{
	public void run(){
		for(int i=1;i<=3;i++){
			System.out.println(Thread.currentThread().getName()+" perform "+i+"task");
		}
	}
}


public class Test5 {

	public static void main(String[] args) throws InterruptedException {
		System.out.println("Main thread started....");
		
		DoTask t1 = new DoTask();
		t1.setName("Worker thread");
        t1.start();
        t1.join();
        
        DoTask2 t2 = new DoTask2();
        t2.setName("Worker2");
        t2.start();
        t2.join();
        System.out.println("Main thread completed.");
	}

}
