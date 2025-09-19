package Tasks;

import java.util.Scanner;

public class MinAndMaxArrayElements {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		
		System.out.print("Enter the size of array: ");
		int n = scn.nextInt();
		int arr[] = new int[n];
		
		System.out.println("Enter the "+n+" elements:");
		for(int i=0;i<n;i++) {
			arr[i]=scn.nextInt();
		}
		
		//Finding max element
		int max=arr[0];
		
		for(int i=1;i<n;i++) {
			if(arr[i]>max) {
				max=arr[i];
			}
		}
		System.out.println("The max element is: "+max);
		
		//Finding min element
				int min=arr[0];
				
				for(int i=1;i<n;i++) {
					if(arr[i]<min) {
						min=arr[i];
					}
				}
				System.out.println("The min element is: "+min);
		
		
		scn.close();
	}

}
