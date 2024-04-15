package com.irctc.reservation;

public class Passenger extends Thread{
   private String passengerName;
   private int requestedSeats;
   private TicketBooking ticketBooking;
public Passenger(String passengerName, int requestedSeats, TicketBooking ticketBooking) {
	super();
	this.passengerName = passengerName;
	this.requestedSeats = requestedSeats;
	this.ticketBooking = ticketBooking;
}
   public void run(){
	   this.ticketBooking.booking(passengerName, requestedSeats);
   }
}
