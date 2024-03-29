package com.arrays.problems;

public class Test4 {
   public static int getLargestElement(int[] arr){
	   int largestElement=arr[0];
	   for(int i=1;i<arr.length;i++){
		   if(largestElement<arr[i]){
			   largestElement = arr[i];
		   }
	   }
	  return largestElement; 
   }
	public static void main(String[] args) {
		int[] arr = {1,9,4,10,3,2,-7};
        System.out.println(getLargestElement(arr));
	}

}
