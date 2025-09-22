package pattern;

import java.util.Scanner;

public class RightHalfPyramid {
public static void main(String[] args) {
	Scanner scn = new Scanner(System.in);
	System.out.print("Enter the number: ");
	int num = scn.nextInt();
	for(int i = 0;i<num;i++) {
		for(int j = 0;j<=i;j++) {
			System.out.print("* ");
		}
		System.out.println(" ");
	}
	scn.close();
}
}
