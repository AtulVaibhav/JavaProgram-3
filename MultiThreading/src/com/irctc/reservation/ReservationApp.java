package com.irctc.reservation;

public class ReservationApp {

	public static void main(String[] args) {
		TicketBooking ticketBooking = new TicketBooking();
		Passenger p1 = new Passenger("Amit",7,ticketBooking);
		Passenger p2 = new Passenger("Harsh", 5, ticketBooking);
		p1.start();
		p2.start();

	}

}
