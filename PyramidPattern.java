package pattern;

import java.util.Scanner;

public class PyramidPattern {
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
				System.out.print("* ");
			}
			System.out.println();
		}
		System.out.println("This is number pyramid pattern:");
		for(int i=0;i<n;i++) {
			for(int s=0;s<n-i-1;s++) {
				System.out.print("  ");
			}
			for(int j=0;j<i*2+1;j++) {
				System.out.print(j+1+" ");
			}
			System.out.println();
		}
		System.out.println("This is another number pyramid pattern:");
		for(int i=0;i<n;i++) {
			for(int s=0;s<n-i-1;s++) {
				System.out.print("  ");
			}
			for(int j=0;j<i*2+1;j++) {
				System.out.print(i+1+" ");
			}
			System.out.println();
		}
		scn.close();
	}

}
