package Tasks;

import java.util.Scanner;

public class StringListInArray {
	public static void main(String[] args) {
		Scanner scn =  new Scanner(System.in);
		String arr[] = new String[5];
		
		System.out.println("Enter the Array elements: ");
		for(int i=0;i<5;i++) {
			arr[i] = scn.next();
		}
		System.out.println("The elements are: ");
		for(int i=0;i<5;i++) {
			System.out.println(arr[i]);
		}
		scn.close();
	}
}
