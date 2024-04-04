package com.stringBuffer;

public class Test2 {

	public static void main(String[] args) {
		StringBuffer sb  = new StringBuffer("Java");
		
		//reverse
		//System.out.println(sb.reverse());
		
		//insert
		sb.insert(1, "Hello");
		System.out.println(sb);
		
		//delete
       sb.delete(1, 6);
       System.out.println(sb);
       
       //replace
       sb.replace(1, 4, "Hello");
       System.out.println(sb);
       
       //length()
       System.out.println(sb.length());
       
       //charAt
       System.out.println(sb.charAt(1));
       
	}

}
