package Tasks;

import java.util.Scanner;

public class FindDupicateElementInArray {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		
		//getting array size
		System.out.print("Enter the array size: ");
		int n = scn.nextInt();
		int arr[] = new int[n];
		
		//getting array elements
		System.out.println("Enter the array elements: ");
		for(int i=0;i<arr.length;i++) {
			arr[i] = scn.nextInt();
		}
		
		//printing the array elements
		System.out.println("The array elements with duplication: ");
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}
		
		//find and printing the duplicate elements
		System.out.println("\nThe duplicate elements are:");
		int count=0;
		for(int i=0;i<arr.length;i++) {
			for(int j=i+1;j<arr.length;j++) {
				if(arr[i]==arr[j]) {
					count++;
				}
			}
			if(count==1) {
				System.out.print(arr[i]+",");
				count=0;
			}
		}
		scn.close();
	}
	
}
