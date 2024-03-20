package com.learning;

public class LocalVariable {
   public int m1(){
	   int a=10;
	   //System.out.println(a);
	   return a;
   }
  
	public static void main(String[] args) {
		
        System.out.println(new LocalVariable().m1());
	}

}
