package com.string.problems;

public class Test1 {

	public static void main(String[] args) {
		String str = "Java is a programmming language";
         String[] arr = str.split(" ");
         for(int i=arr.length-1;i>=0;i--){
        	 System.out.print(arr[i]+" ");
         }
	}

}
