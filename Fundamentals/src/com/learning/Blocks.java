package com.learning;

public class Blocks {
	//static block
    static{
    	System.out.println("static block executed");
    }
    
    //initialization block
    {
    	System.out.println("initialization block executed");
    }
	public static void main(String[] args) {
		Blocks b1 = new Blocks();
		Blocks b2 = new Blocks();

	}

}
