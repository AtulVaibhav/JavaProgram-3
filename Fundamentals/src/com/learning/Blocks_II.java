package com.learning;

public class Blocks_II {
   static{
	   System.out.println("static block executed");
   }
   
   Blocks_II(){
	   System.out.println("constructor called");
   }
   
   {
	   System.out.println("initialization block executed");
   }
	public static void main(String[] args) {
		Blocks_II obj = new Blocks_II();

	}

}
