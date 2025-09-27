package Tasks;

import java.util.Scanner;

public class RemoveDuplicateArray {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter the array size: ");
		int size= sc.nextInt();
		
		int[] arr = new int[size];
		System.out.println("Enter elements of array: ");
		for(int i=0;i<size;i++) {
			arr[i] = sc.nextInt();
		}

		
		for(int i=0; i<size-1; i++) {
			for(int j=0; j<size-i-1; j++) {
				if(arr[j] > arr[j+1]) {
					int temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
				}
			}
		}

		
		System.out.print("Unique elements are: ");
		for(int j=0; j<size;j++) {
			while((j+1)<size && arr[j]==arr[j+1]) {
				j++;
			}
			System.out.print(arr[j] + " ");
		}
		sc.close();
	}

}