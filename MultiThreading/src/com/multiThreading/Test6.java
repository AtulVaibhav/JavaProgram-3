package com.multiThreading;

class SR {
	public void print(int num){
		for(int i=1;i<=10;i++){
			System.out.println(Thread.currentThread().getName()+"--->"+(num*i));
		}
		System.out.println("_____________________________________________________");
	}
}

class TA extends Thread{
	private SR obj ;
	public TA(SR obj){
		this.obj= obj;
	}
	
	public void run(){
		this.obj.print(2);
	}
}

class TB extends Thread{
	private SR obj ;
	public TB(SR obj){
		this.obj= obj;
	}
	
	public void run(){
		this.obj.print(5);
	}
}

public class Test6 {

	public static void main(String[] args) throws InterruptedException {
		SR obj = new SR();
		TA t = new TA(obj);
		TB t2 = new TB(obj);
      
		
		t.setName("A");
		t2.setName("B");
		
		t.start();
		t.join();
		
		
		t2.start();
		t2.join();
		
		
		
		
	}

}
