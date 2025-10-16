package Tasks;

import java.util.Scanner;

public class ArmstrongNumber{
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.print("Enter the number to check Armstrong or Not: ");
		int num = scn.nextInt();
		int sum = 0,sep,digit=0;
		int temp = num;
		int temp1 = num;
		while(temp1>0) {
			temp1 = temp1/10;
			digit++;
		}
		while(num>0) {
			sep = num%10;
			sum += Math.pow(sep,digit);
			num = num/10;
		}
		if(sum==temp) {
			System.out.println(temp + " is Armstrong number");
		}
		else
			System.out.println(temp + " is not Armstrong number");
		scn.close();
	}

}

