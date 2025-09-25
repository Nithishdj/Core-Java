package com.index;

public class MatrixMultiplication {
	public static void main(String[] args) {
		
		int arr1[][] = {{1,2,3},{4,5,6},{6,7,8}};
		int arr2[][] = {{12,23,34},{5,8,5},{41,9,10}};
		
		int mul[][] = new int[3][3];
		
		for(int i=0;i<3;i++) {
			for(int j=0;j<3;j++) {
				mul[i][j]=0;
				for(int k=0;k<3;k++) {
					mul[i][j] = mul[i][j] + arr1[i][k] * arr2[k][j];
				}
				System.out.print(mul[i][j]+" ");
			}
			System.out.println();
		}
	}
}
