package com.index;

public class MatrixSubtraction {
	public static void main(String[] args) {
		//creating 2 matrices
		int arr1[][] = {{32,1,43},{12,32,5},{44,9,35}};
		int arr2[][] = {{54,8,13},{42,5,2},{23,40,7}};
		
		//creating Sub array
		int sub[][] = new int[3][3];
		
		//Sub the two matrices and stored in sub array
		System.out.println("The sub of two matrices are: ");
		for(int i=0;i<3;i++) {
			for(int j=0;j<3;j++) {
				sub[i][j] = arr1[i][j] - arr2[i][j];
				System.out.print(sub[i][j]+" ");
			}
			System.out.println();
		}
		
	}
	

	
	

}
