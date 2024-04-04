package com.stringBuffer;

public class Test {

	public static void main(String[] args) {
		StringBuffer sb = new StringBuffer();
		sb.append("Java");
		System.out.println(sb.hashCode());
		
		sb.append("World");
		System.out.println(sb.hashCode());
		System.out.println(sb);
		
		System.out.println("___________________________");
		StringBuffer sb1 = new StringBuffer();
		System.out.println(sb1.capacity());
		sb1.append("abcdefghijklmnopq");
		System.out.println(sb1.capacity());
		
		StringBuffer sb2 = new StringBuffer(20);
		System.out.println(sb2.capacity());
		
		
	}

}
