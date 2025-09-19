package com.index;

import java.util.Scanner;

public class AverageOfArray {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.print("Enter the number of elements: ");
		int n = scn.nextInt();
		int arr[] = new int[n];
		
		//get input array elements from user
		int sum=0;
		System.out.println("Enter the "+n+" elements: ");
		for(int i=0;i<n;i++) {
			arr[i]=scn.nextInt();
			sum +=arr[i];
		}
		
		//Calculate average value of an array
		float avg = sum/n;
		System.out.print("The average of an array is: "+avg);
		
		scn.close();
	}
}
