package com.irctc.reservation;

public class TicketBooking {
   static int availableSeats = 10;
   public synchronized void booking(String username,int requestedSeats){
	   System.out.println("Welcome to IRCTC");
	   System.out.println("Hello "+username+
			   ". You have requested for "+requestedSeats+" seats");
	   
	   System.out.println("Checking for availability.Please wait....");
	   try {
		Thread.sleep(3000);
	} catch (InterruptedException e) {
		e.printStackTrace();
	}
	   if(availableSeats>=requestedSeats){
		   availableSeats = availableSeats - requestedSeats;
		   System.out.println("Hello "+username+".Seats confirmed...");
	   }else{
		   System.out.println("Sorry "+username+".No seats available");
	   }
	   
	   System.out.println("Thank you for using IRCTC..");
	   try {
		Thread.sleep(2000);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
   }
   
}
