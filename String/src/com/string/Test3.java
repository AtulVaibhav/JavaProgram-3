package com.string;

public class Test3 {

	public static void main(String[] args) {
		String str = new String("Hello");
		String str2 = new String("Hello");
//		if(str==str2){
//			System.out.println("Points to same object");
//		}else{
//			System.out.println("Points to different object");
//		}
		
		System.out.println(str.hashCode());
		System.out.println(str.intern().hashCode());
	}

}
