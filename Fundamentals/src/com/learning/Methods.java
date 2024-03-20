package com.learning;

public class Methods {
   //non-static methods
	public void m1(){
		System.out.println("m1() called");
	}
	
	public int m2(){
		return 10;
	}
	
	//static methods
	public static void m3(){
		System.out.println("m3() called");
	}
	
	public static int m4(){
		return 20;
	}
	public static void main(String[] args) {
	   Methods m = new Methods();
	   m.m1();
	  int result =  m.m2();
      System.out.println(result);
      
      Methods.m3();
      System.out.println(Methods.m4());
	}

}
