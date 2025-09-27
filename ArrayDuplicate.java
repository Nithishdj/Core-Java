package Tasks;

import java.util.Scanner;

public class ArrayDuplicate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
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

		
		for(int i=0; i<size;i++) {
			int counter =1;
			while((i+1)<size && arr[i]==arr[i+1]) {
				i++;
				counter++;
			}
			if(counter>1) {
				System.out.println(arr[i]+" is repeated "+counter+" times.");
			}
		}
		sc.close();
	}

}