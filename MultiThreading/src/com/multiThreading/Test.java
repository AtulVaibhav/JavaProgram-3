package com.multiThreading;

public class Test {
     public static void m1(){
    	 System.out.println("Current running thread in m1() :"+Thread.currentThread().getName());
     }
	public static void main(String[] args) {
		System.out.println("Current running thread :"+Thread.currentThread().getName());
	    m1();
	}

}
