package com.arrays;

public class AccessingElements {

	public static void main(String[] args) {
		int[] arr = {1,2,3,4,5};
		
		//accessing single element :indexing
		System.out.println(arr[2]);
		
		System.out.println("--------------------------");
		//accessing all elements
		for(int i=0;i<arr.length;i++){
			System.out.println(arr[i]);
		}
        System.out.println("________________________________");
		//enhanced for loop
		//for(dataType ele:nameOfarr){}
		
		for(int data:arr){
			System.out.println(data);
		}
		
		
		
	}

}
