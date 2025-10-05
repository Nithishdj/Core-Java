package Tasks;

import java.util.Scanner;

public class SwitchCalci {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.print("Enter number 1: ");
		int num1 = scn.nextInt();
		System.out.print("Enter number 2: ");
		int num2 = scn.nextInt();
		System.out.print("Enter the operator(+, -, *, /): ");
		String sign = scn.next();
		int result=0;
		
		switch(sign) {
		case "+":{
			result=num1+num2;
			break;
		}
		case "-":{
			result=num1-num2;
			break;
		}
		case "*":{
			result=num1*num2;
			break;
		}
		case "/":{
			result=num1/num2;
			break;
		}
		default:{
			System.out.println("Invalid operator");
		}
		}
		System.out.println("The result is: "+result);
		scn.close();
		
	}

}
