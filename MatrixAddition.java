package com.index;

public class MatrixAddition {
	public static void main(String[] args) {
		//creating two matrices
		int arr1[][] = {{12,23,34},{1,2,3},{5,34,2}};
		int arr2[][] = {{4,91,32},{32,21,54},{9,2,5}};
		
		//Creating another matrix to store the sum of matrices
		int sum[][] = new int[3][3];
		
		//adding and printing the 2 matrices
		System.out.println("The sum of two matrices are: ");
		for(int i=0;i<3;i++) {
			for(int j=0;j<3;j++) {
				sum[i][j] = arr1[i][j] + arr2[i][j];
				System.out.print(sum[i][j]+" ");
			}
			System.out.println();
		}
	}
}
