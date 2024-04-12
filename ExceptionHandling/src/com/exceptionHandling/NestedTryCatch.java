package com.exceptionHandling;

public class NestedTryCatch {
    public static void m1(){
    	try{
    		String str = null;
    		System.out.println(str.length());
    		
    		try{
    			System.out.println(12/0);
    		}catch(ArithmeticException ape){
    			System.out.println("Exception handled by inner catch-block");
    		}
    		
    	}catch(NullPointerException npe){
    		System.out.println("Exception handled by outer catch-block");
    	}
    }
	public static void main(String[] args) {
		m1();

	}

}
