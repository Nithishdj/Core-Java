package Tasks;

import java.util.Scanner;

public class ReplaceElementInArray {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		
		System.out.print("Enter array size: ");
		int n = scn.nextInt();
		int arr[] = new int[n];
		
		System.out.println("Enter the "+n+" elements");
		for(int i=0;i<n;i++) {
			arr[i] = scn.nextInt();
		}
		
		System.out.print("Enter the position to be replaced: ");
		int pos = scn.nextInt();//Position of element to be replaced
		
		System.out.print("Enter the value to be replaced: ");
		int x = scn.nextInt();//Value to be replaced
		
		System.out.println("The elements before replaced: ");
		for(int i=0;i<n;i++) {
			System.out.print(arr[i]+" ");
		}
		
		//Replacing elements
		arr[pos-1] = x;
		System.out.println("\nArray with replaced element: ");
		for(int i=0;i<n;i++) {
			System.out.print(arr[i]+" ");
		}
		
		scn.close();
	}

}
