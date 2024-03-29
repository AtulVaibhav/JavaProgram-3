package com.arrays.problems;

public class Test {
	public static int getSum(int[] arr){
		int sum=0;
		for(int i=0;i<arr.length;i++){
			sum += arr[i];
		}
		return sum;
	}
	public static void main(String[] args) {
		int[] arr={14,15};
		System.out.println(getSum(arr));
	}

}
