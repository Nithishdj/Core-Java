package com.index;

import java.util.Scanner;

public class JavaConditional{
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.print("Enter the number: ");
		int num = scn.nextInt();
		if(num==0) {
			System.out.print("It is Neutral");
		}
		else if(num>0) {
			System.out.print("Positive number");
		}
		else {
			System.out.print("Negative number");
		}
		scn.close();
	}

public class OddEvenLoop{
	public static void main(String[] args) {
		int sum=0,sum1=0;
		for(int i = 1;i<=50;i++) {
			if(i%2==0) {
				sum+=i;
			}
			else {
				sum1+=i;
			}
		}
		System.out.println("Even num sum value: "+sum);
		System.out.println("Odd num sum value: "+sum1);
	}
}
public class SwitchCalci{
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.print("Enter the number 1: ");
		int num1 = scn.nextInt();
		System.out.print("Enter the number 2: ");
		int num2 = scn.nextInt();
		int sum = 0;
		System.out.print("Choose one operator(+, -, *, /, %): ");
		String str = scn.next();
		switch(str) {
		case "+": sum= num1 + num2;break;
		case "-": sum= num1 - num2;break;
		case "*": sum= num1 * num2;break;
		case "/": sum= num1 / num2;break;
		case "%": sum= num1 % num2;break;
		default: 
			System.out.println("Invalid operator");
		}
		System.out.println("The result is: "+sum);
		scn.close();
	}
}
public class FrequencyOfLetters{
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.print("Enter the word: ");
		String str = scn.next();
		int[] arr = new int[256];
		
		for(int i=0; i<=str.length()-1; i++) {
		char ch = str.charAt(i);
		int x = (int)ch;
		arr[x]++;
		}
		for(int i=0;i<256;i++) {
			if(arr[i] != 0) {
				System.out.println((char)i+ " --> "+arr[i]);
			}
		}
		scn.close();
		}
}
public class NumUptoTen{
	public static void main(String[] args) {
		int num = 10;
		if(num>=10) {
			System.out.println(num);
			num--;
			}
		if(num>=9) {
			System.out.println(num);
			num--;
			}
		if(num>=8) {
			System.out.println(num);
			num--;
			}
		if(num>=7) {
			System.out.println(num);
			num--;
			}
		if(num>=6) {
			System.out.println(num);
			num--;
			}
		if(num>=5) {
			System.out.println(num);
			num--;
			}
		if(num>=4) {
			System.out.println(num);
			num--;
			}
		if(num>=3) {
			System.out.println(num);
			num--;
			}
		if(num>=2) {
			System.out.println(num);
			num--;
			}
		if(num>=1) {
			System.out.println(num);
			}
		
	}
}
}
