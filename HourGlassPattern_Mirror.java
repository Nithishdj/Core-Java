package pattern;

import java.util.Scanner;

public class HourGlassPattern_Mirror {
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
				System.out.print("* ");
			}
			System.out.println();
		}
		
		System.out.println("The Hourglass pattern in numbers: ");
		for(i=-n+1;i<n;i++) {
			if(i<0)
				l=-i;
			else
				l=i;
			for(s=0;s<n-l;s++) {
				System.out.print(" ");
			}
			for(j=0;j<l+1;j++) {
				System.out.print(j+1+" ");
			}
			System.out.println();
		}
		scn.close();
	}
}
