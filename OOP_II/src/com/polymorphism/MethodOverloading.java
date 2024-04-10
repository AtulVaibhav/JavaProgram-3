package com.polymorphism;

class Shape{
	
	public void area(int a,int b){
		System.out.println("area1");
	}
	
	public void area(int a){
		System.out.println("area2");
	}
	
	public void area(String a){
		System.out.println("area3");
	}
}


public class MethodOverloading {
 public static void main(Integer[] args){
	 System.out.println("custom main-method");
 }
	public static void main(String[] args) {
	  Shape shape = new Shape();
	  shape.area(12,14);
	  Integer[] arr = {1,2,3,4};
	  main(arr);

	}

}
