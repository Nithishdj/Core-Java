package com.index;

import java.util.Scanner;

public class InsertElementArray {
public static void main(String[] args) {
	int n ,x, pos;
	
	//no. of elements in array
	Scanner scn = new Scanner(System.in);
	System.out.print("Enter no. of elements you want in array: ");
	n = scn.nextInt();

	
	//Array initialization
	int a[] = new int[n+1];
	System.out.println("Enter all elements: ");
	for(int i = 0;i<n;i++) {
		a[i] = scn.nextInt();
	}
	System.out.print("Enter the position you want to insert in array: ");
	pos = scn.nextInt();

	System.out.print("Enter the element you want to insert: ");
	x= scn.nextInt();
	
	for(int i = (n-1); i>=(pos-1);i--) {
		a[i+1] = a[i];
	}
	a[pos-1]=x;//in that position x value will placed
	System.out.println("After inserting: ");
	for(int i = 0;i <= n;i++) {
		System.out.print(a[i]+" ");
	}
	scn.close();
}
}
