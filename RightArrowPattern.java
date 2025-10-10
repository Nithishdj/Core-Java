package pattern;

import java.util.Scanner;

public class RightArrowPattern {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		
		System.out.print("Enter the number: ");
		int n = scn.nextInt();
		
		int i,j,s,l;
		for(i=-n;i<=n;i++) {
			if(i<0)
				l=-i;
			else
				l=i;
			for(s=0;s<n-l;s++) {
				System.out.print("  ");
			}
			for(j=0;j<l+1;j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
		scn.close();
	}
}
