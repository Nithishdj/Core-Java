package Tasks;

import java.util.Scanner;

public class EqualityOfArray {
	public static void main(String[] args) {
	
		
		Scanner scn = new Scanner(System.in);
		System.out.print("Enter the length of first array: ");
		int num1 = scn.nextInt();
		
		System.out.print("Enter the length of second array: ");
		int num2 = scn.nextInt();
		
		//Array initialization
		int arr1[] = new int[num1];
		int arr2[] = new int[num2];
		
		//Enter the elements in array
		System.out.println("Enter the elements for first array");
		for(int i=0;i<arr1.length;i++) {
			arr1[i]=scn.nextInt();	
		}
		System.out.println("Enter the elements for second array");
		for(int i=0;i<arr2.length;i++) {
			arr2[i]=scn.nextInt();	
		}
		

		//Array length checking
		boolean status = true;
		if(arr1.length == arr2.length) {
			for(int i=0;i<arr1.length;i++) {
				//checking the equality of elements
				if(arr1[i] != arr2[i]) {
					status = false;
				}
			}
		}
		else
			status = false;
		
		
		if(status==true) {
			System.out.println("Both arrays are same!");
		}
		else
			System.out.println("Arrays are not same!");
		scn.close();
	}
}
