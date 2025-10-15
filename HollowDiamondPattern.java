
package pattern;

import java.util.Scanner;

public class HollowDiamondPattern {
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
			for(s=0;s<l;s++) {
				System.out.print(" ");
			}
			for(j=0;j<n-l+1;j++) {
				if(j==0 || i+j==n || -i+j==n)
					System.out.print("* ");
				else
					System.out.print("  ");
			}
			System.out.println();
		}
		scn.close();
	}
}

