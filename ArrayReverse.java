package Tasks;

import java.util.Scanner;

public class ArrayReverse {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		
		System.out.print("Enter the array size: ");
		int n = scn.nextInt();
		int arr[] = new int[n];
		
		System.out.println("Enter the "+n+" elements:");
		for(int i=0;i<n;i++) {
			arr[i]=scn.nextInt();
		}
		
		System.out.print("The reversed array is: ");
		for(int i=n-1;i>=0;i--) {
			System.out.print(arr[i]+" ");
		}
		scn.close();
	}

}
