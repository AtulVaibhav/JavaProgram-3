package com.polymorphism;

class Base{
	
	int data = 100;
	
}

class Derived extends Base{
	int data = 200;
	
	public void m1(){
		System.out.println("Called from Child class");
	}
}

public class DynamicDispatch {

	public static void main(String[] args) {
		Base b = new Derived();
		//System.out.println(b.data);
        // b.m1();
         
//         Derived d = new Derived();
//         d.m1();
	}

}
