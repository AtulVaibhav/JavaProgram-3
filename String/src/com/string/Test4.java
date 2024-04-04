package com.string;

import java.util.Arrays;

public class Test4 {

	public static void main(String[] args) {
		//String methods
		//length():
		String str = "Hello";
		System.out.println(str.length());
		
		//charAt
		System.out.println(str.charAt(0));
		
		//indexOf: first occurring
		System.out.println(str.indexOf('l'));
		
		//lastIndexOf
		System.out.println(str.lastIndexOf('l'));
		
		//subString
		System.out.println(str.substring(0,4));
		
		//toUpper
		System.out.println(str.toUpperCase());
		
		//toLowerCase()
		System.out.println(str.toLowerCase());
		
		//toCharArray()
		char []arr = str.toCharArray();
		System.out.println(Arrays.toString(arr));
		
		//split
		String str2 = "Hello Java";
		String[] arr2 = str2.split(" ");
		System.out.println(Arrays.toString(arr2));

	}

}
