package com.banking;

import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		char ch;
		System.out.println("--------------Welcome to ABC Bank----------");
        
        int count=1;
        while(count<4){
        	System.out.println("Enter the secret key");
            int secretKey = sc.nextInt();
        	if(secretKey==CustomerDB.getPin()){
        		//System.out.println("Valid");
        		do{
        		System.out.println("1.deposit    2.withdraw    3.balEnquiry");
        		System.out.println("Select any option to proceed");
        		int option = sc.nextInt();
        		switch(option){
        		case 1: BankingUtil.deposit(sc);
        		        break;
        		case 2: BankingUtil.withdraw(sc);
        		        break;
        		        
        		case 3: System.out.println(BankingUtil.bal());
        		        break;
        		default:System.out.println("Invalid option.Try Again!!!!");
        		}
        		System.out.println("Do you want to continue? y/n");
        		ch = sc.next().charAt(0);
        		}while(ch=='y');
        		break;
        	}else{
        		System.out.println("Invalid pin.");
        		++count;
        		if(count==4){
        			System.out.println("Card blocked..Please contact with the nearest branch");
        		}
        	}
        }
        System.out.println("Thank you for banking with us");
        
	}

}
