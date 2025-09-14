package Tasks;

import java.util.Scanner;

public class Factorial {
public static void main(String[] args) {
	Scanner scn = new Scanner(System.in);
	System.out.print("Enter the number: ");
	int num = scn.nextInt();
	int fact = 1;
	for(int i=num;i>0;i--) {
		fact *= i;
	}
	System.out.print("The factorial of "+num+" is "+fact);
	scn.close();
}
}
