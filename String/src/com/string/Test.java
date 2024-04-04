package com.string;

public class Test {

	public static void main(String[] args) {
		String str = "Java";
		System.out.println(str);
		str.concat("Hello");
		System.out.println(str);
		System.out.println(str.hashCode());
		
		System.out.println("_________________________");
		str = str.concat("World");
		System.out.println(str.hashCode());
		System.out.println(str);
	}

}
