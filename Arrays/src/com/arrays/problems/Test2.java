package com.arrays.problems;

public class Test2 {
    public static int getIndex(int[] arr,int key){
    	for(int i=0;i<arr.length;i++){
    		if(arr[i]==key)return i;
    	}
    	return -1;
    }
	public static void main(String[] args) {
		int[] arr = {21,22,55,35,7};
		int key = 55;
		
		int result = getIndex(arr,key);
		if(result<0){
			System.out.println("key not found");
		}else{
			System.out.println("Key found at position "+result);
		}
	}

}
