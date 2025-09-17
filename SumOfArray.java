package com.index;

import java.util.Scanner;

public class SumOfArray{
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.print("Enter the number of elements: ");
		int n = scn.nextInt();		
		int arr[] = new int [n];
		int sum=0;
		System.out.println("Enter the "+n+" numbers to sum: ");
		for(int i=0;i<arr.length;i++) {
			arr[i] = scn.nextInt();
			sum+=arr[i];
		}
		System.out.println("The sum of array elements are: "+sum);
		scn.close();
	}
}
