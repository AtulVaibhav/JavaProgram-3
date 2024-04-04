package com.arrays;

import java.util.Arrays;
import java.util.Scanner;

public class UserInput {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of an array");
		int size = sc.nextInt();
		// dt[] arrName = new dt[size]
		int[] arr = new int[size];
		
		System.out.println("Enter the elements");
		for(int i=0;i<arr.length;i++){
			arr[i] = sc.nextInt();
		}
		
		System.out.println("Displaying the elements");
		System.out.println(Arrays.toString(arr));

	}

}
