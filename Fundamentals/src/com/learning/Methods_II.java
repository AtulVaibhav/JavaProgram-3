package com.learning;

public class Methods_II {
    int a=10;
    static int b=20;
    
    //non-static
    public void m1(){
    	System.out.println(a);
    	System.out.println(b);
    }
    
    //static  
    public static void m2(){
    	System.out.println(b);
    	System.out.println(new Methods_II().a);
    }
	public static void main(String[] args) {
		Methods_II m = new Methods_II();
		m.m1();
		Methods_II.m2();

	}

}
