package Tasks;

import java.util.Scanner;

public class PrimeNumber{
	public static void main(String[] args) {
		try (Scanner scn = new Scanner(System.in)) {
			System.out.print("Enter the number: ");
			int num = scn.nextInt();
			int i;
			for(i=2;i<=num;i++) {
				if(num % i==0) {
					break;
				}
			}
			if(num==i) {
				System.out.println(num+" is a Prime number");
			}
			else
				System.out.println(num+" is Not a prime number");
			scn.close();
		}
	}
}