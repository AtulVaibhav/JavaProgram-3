package com.arrays.problems;

public class Test5 {
   public static void twoSum(int[] arr, int key){
	   for(int i=0;i<arr.length-1;i++){
		   for(int j=i+1;j<arr.length;j++){
			   if(arr[i]+arr[j]==key){
				   System.out.println(i+" "+j);
			   }
		   }
	   }
   }
	public static void main(String[] args) {
		int[] arr={5,1,10,11,2,3};
		twoSum(arr, 15);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
