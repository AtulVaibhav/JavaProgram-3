package com.two_d_array;

import java.util.Arrays;

public class Test {

	public static void main(String[] args) {
		int[][] arr = {{11,12,13},{21,22,23},{31,32,33}};
		
		for(int i=0;i<arr.length;i++){
			for(int j=0;j<arr[i].length;j++){
				System.out.println(arr[i][j]);
			}
		}
		System.out.println("_______________________________");
		//enhanced for loop
		for(int[] ar:arr){
			for(int data:ar){
				System.out.println(data);
			}
		}
		
		System.out.println("_______________________________");
		System.out.println(Arrays.deepToString(arr));

	}

}
