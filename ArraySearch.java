package com.index;

import java.util.Scanner;

public class ArraySearch {
	public static void main(String[] args) {
		Scanner scn =  new Scanner(System.in);
		System.out.print("Enter the number of elements: ");
		int n = scn.nextInt();
		int arr[]= new int[n];
		
		
		System.out.println("Enter the "+n+" elements");
		for(int i=0;i<n;i++) {
			arr[i]=scn.nextInt();
		}
		
		
		System.out.print("Enter the element you want to search: ");
		int key = scn.nextInt();
		boolean found = false;
		
		for(int i=0;i<n;i++) {
			if(arr[i]==key) {
				System.out.println("The element is found at "+i);
				found = true;
			}
				
			if(!found)
				System.out.println("Element not found!");
		}
		scn.close();
	}

}
