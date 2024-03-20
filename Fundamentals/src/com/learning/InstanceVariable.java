package com.learning;

public class InstanceVariable {
    int a = 10;
    public void m1(){
    	System.out.println("m1() called");
    }
	public static void main(String[] args) {
		//Classtype objName = new Classtype();
		InstanceVariable obj = new InstanceVariable();
		InstanceVariable obj2 = new InstanceVariable();
		
		System.out.println("Before modification");
		System.out.println(obj.a);
		System.out.println(obj2.a);
		
		System.out.println("__________________");
		System.out.println("After modification");
		obj.a = 100;
		System.out.println(obj.a);
		System.out.println(obj2.a);
		
	}

}
