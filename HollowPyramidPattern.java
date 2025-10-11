package pattern;

import java.util.Scanner;

public class HollowPyramidPattern {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.print("Enter the number: ");
		int n = scn.nextInt();
		
		System.out.println("This is star pyramid:");
		for(int i=0;i<n;i++) {
			for(int s=0;s<n-i-1;s++) {
				System.out.print("  ");
			}
			for(int j=0;j<i*2+1;j++) {
				if(j==0 || j==2*i|| i==n-1 )
				System.out.print("* ");
				else
					System.out.print("  ");
			}
			System.out.println();
		}
		scn.close();
	}
}
