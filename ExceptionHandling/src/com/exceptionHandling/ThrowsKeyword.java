package com.exceptionHandling;



public class ThrowsKeyword {
    public static void m1(int id) throws ArithmeticException{
    	if(id<0){
    		throw new ArithmeticException();
    	}else{
    		System.out.println("Valid id");
    	}
    }
	public static void main(String[] args) {
		try{
			m1(-12);
		}catch(Exception e){
			System.out.println("Exception handled");
		}
	}

}
