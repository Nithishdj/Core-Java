package pattern;

import java.util.Scanner;

public class TrianglePattern {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.println("Enter number of rows: ");
		int num = scn.nextInt();
		
		//Outer loop for rows
		for(int i=1;i<=num;i++) {
			//print spaces for each row i from 1 to num
			for(int s=1;s<=num-i;s++) {
				System.out.print(" ");
			}
			for(int j=1;j<=i;j++) {
				System.out.print("* ");//print i stars
			}
			System.out.println();//move to next line
		}
		scn.close();
	}

}
