package com.index;

import java.util.Scanner;

public class MultiArray {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int arr[][] = new int[100][100];//row-100,col-100
		int row,col,i,j;
		System.out.println("Enter no.of rows: ");
		row = scn.nextInt();
		System.out.println("Enter no.of columns: ");
		col = scn.nextInt();
		
		//i-row,j-col
		for(i=0;i<row;i++) {
			for(j=0;j<col;j++) {
				System.out.print("Enter the array elements: ");
				arr[i][j] = scn.nextInt();
			}
		}
		System.out.println("Display 2D array elements is: ");
		for(i=0;i<row;i++) {
			for(j=0;j<col;j++) {
				System.out.print(arr[i][j]+" ");
			}
			System.out.println(" ");
		}
	}

}
