package com.multiThreading;

class Movie{
	static int currentAmount = 900;
	public synchronized void buyingTicket(int requiredAmount) throws InterruptedException{
		if(currentAmount<requiredAmount){
			System.out.println("Waiting for amount to be deposited");
			wait();
		}
		System.out.println("Amount deposited.Bought movie tickets");
	}
	
	public synchronized void depositingAmount(int depositedAmount){
		System.out.println("Depositing amount....");
		currentAmount = currentAmount + depositedAmount;
		notify();
	}
}
class F1 extends Thread{
	private Movie movie;
	F1(Movie movie){
		this.movie = movie;
	}
	public void run(){
		try {
			this.movie.buyingTicket(1500);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}

class F2 extends Thread{
	private Movie movie;
	F2(Movie movie){
		this.movie = movie;
	}
	public void run(){
		try {
			this.movie.depositingAmount(1000);;
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}


public class Test9 {

	public static void main(String[] args) {
		Movie movie = new Movie();
		F1 t1 = new F1(movie);
		F2 t2 = new F2(movie);
		
		t1.start();
		t2.start();
		
		
		
		

	}

}
