package pattern;

import java.util.Scanner;

public class SquareNumberPattern {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.print("Enter the number: ");
		int n = scn.nextInt();
		
		System.out.println("First pattern");
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
				System.out.print(i+1+" ");
			}
			System.out.println();
		}
		System.out.println("Second pattern");
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
				System.out.print(j+1+" ");
			}
			System.out.println();
		}
		scn.close();
	}

}
