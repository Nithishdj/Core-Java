package pattern;

import java.util.Scanner;

public class LeftArrowPattern {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		
		System.out.print("Enter the nuummber: ");
		int n=scn.nextInt();
		
		int i,j,l;
		
		for(i=-n;i<=n;i++) {
			if(i<0)
				l=-i;
			else
				l=i;
			for(j=0;j<l+1;j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
		scn.close();
	}

}
