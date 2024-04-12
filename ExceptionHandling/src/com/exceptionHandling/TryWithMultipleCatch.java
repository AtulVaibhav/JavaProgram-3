package com.exceptionHandling;

public class TryWithMultipleCatch {
   public static void m1(){
	   try{
		   System.out.println(Integer.parseInt("123efg"));
	   }catch(NullPointerException npe){
		   System.out.println("Exception handled in 1st catch block");
	   }catch(ArithmeticException ae){
		   System.out.println("Exception handled in 2nd catch block");
	   }catch(ArrayIndexOutOfBoundsException e){
		   System.out.println("Exception handled in 3rd catch block");
	   }
   }
	public static void main(String[] args) {
		m1();

	}

}
