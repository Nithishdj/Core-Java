package com.index;

import java.util.Scanner;

public class EvenOddArray {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.print("Enter the number of elements: ");
		int n = scn.nextInt();
		int arr[] = new int[n];
		
		for(int i = 0;i < arr.length;i++) {
			arr[i] = scn.nextInt();
		}
		System.out.println("The even numbers in array are: ");
		for(int i = 0;i < arr.length;i++) {
			if(arr[i]%2==0) {
				System.out.print(arr[i]+" ");
			}
		}
		System.out.println("\nThe odd numbers in array are: ");
		for(int i = 0;i < arr.length;i++) {
			if(arr[i]%2!=0) {
				System.out.print(arr[i]+" ");
			}
		}
		scn.close();
	}

}
