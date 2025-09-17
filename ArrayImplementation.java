package com.index;

import java.util.Scanner;

public class ArrayImplementation {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.print("Enter the number of elements: ");
		int n = scn.nextInt();
		
		int[]arr = new int[n];
		//Input
		System.out.println("Enter "+n+" elements: ");
		for(int i=0;i<n;i++) {
			arr[i]=scn.nextInt();
		}
		//Output
		System.out.println("The array elements are:");
		for(int i=0;i<n;i++) {
			System.out.print(arr[i]+" ");
		}
		scn.close();
	}

}
