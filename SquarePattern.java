package pattern;

import java.util.Scanner;

public class SquarePattern {
public static void main(String[] args) {
	Scanner scn = new Scanner(System.in);
	System.out.print("Enter the number: ");
	int num = scn.nextInt();
	for(int i = 0;i<num;i++) {
		for(int j = 0;j<num;j++) {
			System.out.print("* ");
		}
		System.out.println(" ");
	}
	scn.close();
}
}
