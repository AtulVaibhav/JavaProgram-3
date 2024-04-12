package com.exceptionHandling;

public class FinallyBlockWithReturnStatement {
   public static int m1(){
	   try{
		   int a = 12/0;
		   return 2;
	   }catch(Exception e){
		   return -1;
	   }finally{
		   return 3;
	   }
   }
	public static void main(String[] args) {
		System.out.println(m1());
	}

}
