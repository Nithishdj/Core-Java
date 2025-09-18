package com.index;

import java.util.Scanner;

public class BubbleSort {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		
		System.out.print("Enter the number of elements: ");
		int size = scn.nextInt();
		int arr[] = new int[size];
		
		System.out.println("Enter the "+size+" elements");
		for(int i = 0;i<size;i++) {
			arr[i]=scn.nextInt();
		}
		
		//Bubble sort(no built-in methods)
		for(int i=0;i<size-1;i++) {
			for(int j=0;j<size -i -1;j++) {
				//Note
				//For ascending = >
				//For descending = <
				if(arr[j] > arr[j+1]) {
					int temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
				}
			}
		}
		
		//Printing the sorted array
			System.out.print("Sorted array (ascending): ");
			for(int i=0;i<size;i++) {
				System.out.print(arr[i]+" ");
			}
		scn.close();
	}

}
