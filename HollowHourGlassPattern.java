package pattern;

import java.util.Scanner;

public class HollowHourGlassPattern {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.print("Enter the number: ");
		int n = scn.nextInt();
		int i,j,s,l;
		
		System.out.println("The Hourglass pattern: ");
		for(i=-n+1;i<n;i++) {
			if(i<0)
				l=-i;
			else
				l=i;
			for(s=0;s<n-l;s++) {
				System.out.print(" ");
			}
			for(j=0;j<l+1;j++) {
				if(i==n-1 || i==-n+1 || j==0 || i+j==0 || i==j)
				System.out.print("* ");
				else
					System.out.print("  ");
			}
			System.out.println();
		}
		scn.close();
	}
}
