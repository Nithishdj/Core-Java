package Tasks;

import java.util.Scanner;

public class SecondMinMaxInArray {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		
		
		//Initialize the Array
		System.out.print("Enter the number of elements: ");
		int size = scn.nextInt();
		int arr[] = new int[size];
		
		//Enter the elements of Array
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
		
		//Print the second min value
		System.out.println("The second min value of an array is: "+arr[1]);
		
		//Again bubble sort to form descending order of an array
		for(int i=0;i<size-1;i++) {
			for(int j=0;j<size -i -1;j++) {
				//Note
				//For ascending = >
				//For descending = <
				if(arr[j] < arr[j+1]) {
					int temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
				}
			}
		}
		
		//Print the second min value
		System.out.println("The second max value of an array is: "+arr[1]);
			
		scn.close();
	}
}



