package Tasks;

import java.util.Scanner;

public class OddEvenSumUsingArray {
	public static void main(String[] args) {
		Scanner scn =  new Scanner(System.in);
		
		System.out.print("Enter the array size: ");
		int n = scn.nextInt();
		int arr[] = new int[n];
		
		System.out.println("Enter the "+n+" elements: ");
		for(int i=0;i<n;i++) {
			arr[i]=scn.nextInt();
		}
		int oddSum=0,evenSum=0;
		for(int i=0;i<n;i++) {
			if(arr[i]%2!=0) {
				oddSum += arr[i];
			}
			else {
				evenSum += arr[i];
			}
		}
		System.out.println("The sum of Even elements are: "+evenSum);
		System.out.print("The sum of Odd elements are: "+oddSum);
	}

}
