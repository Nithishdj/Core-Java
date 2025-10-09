package pattern;

import java.util.Scanner;

public class DownwardArrowPattern {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		
		System.out.print("Enter the number: ");
		int n=scn.nextInt();
		
		int i,j;
		for(i=0;i<=n;i++) {
			for(j=-n;j<=n;j++) {
				if(-(n-i)<j && j< (n-i)) {
					System.out.print("  ");
				}
				else
					System.out.print("* ");
			}
			System.out.println();		}
	}

}
