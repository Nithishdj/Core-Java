package pattern;

import java.util.Scanner;

public class LeftHalfPyramid {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int i,s,j;//declaring variables
		System.out.print("Enter the number: ");
		int n = scn.nextInt();
		
		System.out.println("The left-half pyramid pattern ");
		for(i=0;i<n;i++) {
			for(s=0;s<n-i-1;s++) 
				System.out.print("  ");//prints space
		
			for(j=0;j<n-s;j++) {
				System.out.print("* ");//prints star
			}
			System.out.println(" ");//move to next line
		}
		
		System.out.println("The left-half pyramid number pattern ");
		for(i=0;i<n;i++) {
			for(s=0;s<n-i-1;s++) 
				System.out.print("  ");//prints space
		
			for(j=0;j<n-s;j++) {
				System.out.print(j+1+" ");//prints number
			}
			System.out.println();//move to next line
		}
		
		System.out.println("The another left-half pyramid number pattern ");
		for(i=0;i<n;i++) {
			for(s=0;s<n-i-1;s++) 
				System.out.print("  ");//prints space
		
			for(j=0;j<n-s;j++) {
				System.out.print(i+1+" ");//prints number
			}
			System.out.println();//move to next line
		}
		scn.close();
	}
}
