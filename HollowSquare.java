package pattern;

import java.util.Scanner;

public class HollowSquare {
public static void main(String[] args) {
	Scanner scn = new Scanner(System.in);
	
	System.out.print("Enter the number to print hollow square: ");
	int num = scn.nextInt();
	
	for(int i=0;i<num;i++) {
		for(int j=0;j<num;j++) {
			if(i==0 || j==0 || i==num-1 || j==num-1) {
				System.out.print("*");
			}
			else {
				System.out.print(" ");
			}
		}
		System.out.println(" ");
	}
	scn.close();
}
}
