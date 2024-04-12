package com.exceptionHandling;

public class CatchWithReturnStatement {
    public static int m1(){
    	try{
    		int a = 12/0;
    		return 0;
    	}catch(Exception e){
    		return -1;
    	}
    }
	public static void main(String[] args) {
		System.out.println(m1());

	}

}
