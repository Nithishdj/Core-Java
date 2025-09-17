package com.index;

import java.util.Scanner;

public class ArrayNew {
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
	int min = arr[0];
	int max = arr[0];
	for(int i=0;i<n;i++) {
		if(arr[i]<min) {
			min=arr[i];
		}
		if(arr[i]>max) {
			max=arr[i];
		}
	}
	System.out.println("The minimum value is: "+min);
	System.out.println("Tha maximum value is: "+max);
	scn.close();
}
}
