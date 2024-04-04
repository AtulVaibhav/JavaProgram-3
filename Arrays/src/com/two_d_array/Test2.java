package com.two_d_array;

import java.util.Scanner;

public class Test2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of rows");
		int row = sc.nextInt();
		
		System.out.println("Enthe the number of columns");
		int cols = sc.nextInt();
		
		int[][] arr = new int[row][cols];
		
		System.out.println("Enter the elements");
		for(int i=0;i<row;i++){
			for(int j=0;j<arr[i].length;j++){
				arr[i][j] = sc.nextInt();
			}
		}
		
		System.out.println("Displaying data in matrix format");
		for(int i=0;i<row;i++){
			for(int j=0;j<arr[i].length;j++){
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
	}

}
