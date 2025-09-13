package Tasks;

import java.util.Scanner;

public class SumOfDigits{
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.print("Enter the number: ");
		int num = scn.nextInt();
		int sum = 0,sep;
		while(num>0) {
			sep = num%10;
			sum += sep;
			num = num/10;
		}
		System.out.print("Sum of digits is: "+sum);
		scn.close();
	}
}