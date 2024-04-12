package com.exceptionHandling;

class AgeVericationFailedException extends Exception{
	String msg;
	public AgeVericationFailedException(String msg) {
		this.msg = msg;
	}
	public String getErrorMsg(){
		return this.msg;
	}
}

public class CustomException {
   public static void onlineVoting(int age){
	   if(age<18){
		   try{
		      throw new AgeVericationFailedException("Age verification failed");
		   }catch(AgeVericationFailedException e){
			   System.out.println(e.getErrorMsg());
		   }
	   }else{
		   System.out.println("Welcome to Online Voting System");
	   }
   }
	public static void main(String[] args) {
		onlineVoting(17);

	}

}
