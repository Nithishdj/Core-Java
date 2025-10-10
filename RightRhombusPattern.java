package pattern;

import java.util.Scanner;

public class RightRhombusPattern {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		
		System.out.print("Enter the number: ");
		int n=scn.nextInt();
		
		int i,j,s;
		for(i=0;i<n;i++) {
			for(s=0;s<n-i;s++) {
				System.out.print("  ");
			}
			for(j=0;j<n+1;j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
		scn.close();
	}
}
