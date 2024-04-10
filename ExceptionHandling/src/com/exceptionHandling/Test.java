package com.exceptionHandling;

public class Test {
   public static void doCalculation(int num1,int num2){
	   System.out.println(num1/num2);
	   try{
	     //here
	   }catch(ArithmeticException ae){
		   System.out.println("Exception handled in catch block");
	   }
	   System.out.println("End of method");
   }
	public static void main(String[] args) {
		doCalculation(12, 0);

	}

}
