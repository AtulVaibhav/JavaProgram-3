package com.string;

public class Test2 {

	public static void main(String[] args) {
		String str = "Hello";
		String str2 = "Hello";
		String str3 = "hello";
		if(str==str3){
			System.out.println("Points to same object");
		}else{
			System.out.println("Points to different object");
		}
	}

}
