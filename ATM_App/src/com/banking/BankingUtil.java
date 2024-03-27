package com.banking;

import java.util.Scanner;

public class BankingUtil {
    static int minBal = 500;
    static int currentBal = minBal;
	public static void deposit(Scanner sc){
		 System.out.println("Enter the amount to deposit");
		 int deposit =sc.nextInt();
		 currentBal = currentBal + deposit;
		 System.out.println("Amount deposited successfully.Account credited with Rs."+deposit);
	}
	
	
	public static void withdraw(Scanner sc){
		System.out.println("Enter the amount to withdraw");
		int withdrawAmount =sc.nextInt();
		if(bal()-minBal>=withdrawAmount){
			currentBal = bal()-withdrawAmount;
			System.out.println("Amount debited successfully");
		}else{
			System.out.println("Insufficient balance");
		}
	}
	
	
	public static int bal(){
		return currentBal;
	}
}
