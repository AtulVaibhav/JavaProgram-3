package com.arrays.problems;

import java.util.Arrays;

public class Test3 {
    public static void sort(int[] arr){
    	for(int i=0;i<arr.length-1;i++){
    		for(int j=i+1;j<arr.length;j++){
    			if(arr[i]>arr[j]){
    				int temp = arr[i];
    				arr[i] = arr[j];
    				arr[j] = temp;
    			}
    		}
    	}
    	for(int i=0;i<arr.length;i++){
    		System.out.print(arr[i]+" ");
    	}
    	System.out.println();
    	for(int ele:arr){
    		System.out.print(ele+" ");
    	}
    	System.out.println();
    	
    	System.out.println(Arrays.toString(arr));
    }
	public static void main(String[] args) {
		int[] arr={5,1,4,2,3};
		sort(arr);

	}

}
