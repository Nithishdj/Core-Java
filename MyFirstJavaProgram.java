package com.index;

import java.util.Scanner;

public class MyFirstJavaProgram {

	public static void main(String[] args) {
		int a = 21;
		String str = "Hi";
		char c = 'N';
		long l = 1222221212;
		float f =11.2f;
		double d = 2.22;
		//byte b = 400;
		short s = 21212;
		
	     System.out.println("int as data type " + a);
	     System.out.println("char as data type " + c);
	     System.out.println("long as data type " +l);
	     System.out.println("String as data type " + str);
	     System.out.println("double as data type " + d);
	     System.out.println("short as data type " + s);
	     System.out.println("float as data type " + f);
	      
	     
	     //Type conversion int to double
	     int myint = 4;
	     double mydouble = myint;
	     System.out.println("The value of mydouble " + mydouble);
	     System.out.println("The value of myint " + myint);
	     
	     //Type conversion double to int
	     double mydouble1 = 3.44;
	     int myint1 = (int) mydouble1;
	     System.out.println("The value of mydouble1 " + mydouble1);
	     System.out.println("The value of myint1 " + myint1);
	     
	     //% - Reminder
	     int a1=13, b1=4, result;
	     result=a1%b1;
	     System.out.println("value is "+ result);
	     
	     // - Quotient
	     int a2=13, b2=4, result1;
	     result1=a2/b2;
	     System.out.println("value is "+ result1);
	     
	     //Unary +,- (Increment)
	     int resultunaryplus = 5;
	     System.out.println("value of 5 in post-increment "+ resultunaryplus++);
	     System.out.println("value of 5 in pre-increment "+ ++resultunaryplus);

	     //Decrement
	     int resultunaryminus = 5;
	     System.out.println("value of 5 in post-decrement "+ resultunaryminus--);
	     System.out.println("value of 5 in pre-decrement "+ --resultunaryminus);
	     
	     //Assignment operator
	     System.out.println(a1+=3);	//a1 = a1+3     
	     System.out.println(a1*=3);	//a1 = a1*3  
	     
	     //Comparison operator
	     int x=20, y=30;
	     //less than operator
	     System.out.println((x<y));
	     
	     //greater than operator
	     System.out.println((x>y));
	     
	     //equal to
	     System.out.println((x==y));
	     
	     //less than or equal to
	     System.out.println((x<=y));
	     
	     //greater than or equal to
	     System.out.println((x>=y));
	     
	     //not equal to
	     System.out.println((x!=y));
	     
	     //Logical operator (&&, || , !)
	     boolean x1 = true;
	     boolean y1 = false;
	     System.out.println((x1 && y1));
	     
	     System.out.println((x1 || y1));
	     
	     System.out.println((!x1));
	     
	}
	
public class Teranary{
	public static void main(String[] args) {
		int a = 30, b = 20;
		//(condition) ? true : false;
		int max = (a>b) ? a : b;
		System.out.println("Max is: "+max);
	}
	
public class TernaryWithString{
	public static void main(String[] args) {
		int age = 5;
		String result = (age >= 18) ? "Adult" : "Minor";
		System.out.println("The number is: "+result);
	}
}

public class NestedTernary{
	public static void main(String[] args) {
		// Nested ternary
		int score = 42;
		String grade = (score >= 90) ? "A" :
					   (score >= 80) ? "B" :
					   (score >= 70) ? "C" : "F";
		System.out.println("Grade: "+grade);
	}
}
	}
public class UserInput{
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		//scn.nextLine();//consume next line
		System.out.print("Enter name: ");
		String name = scn.nextLine();
		System.out.print("The name is: "+ name);
		System.out.print("Enter salary: ");
		float num = scn.nextFloat();
		System.out.println("The salary is: "+num);
		if(num<20000) {
			System.out.println("You got low salary");
		}
		else {
			System.out.print("You got high salary");
		}
		System.out.print("Enter the character: ");
		char ch=scn.next().charAt(0);
		System.out.println("The character is "+ch);
	}
public class grade{
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.print("Enter first number: ");
		int num1 = scn.nextInt();
		System.out.print("Enter second number: ");
		int num2 = scn.nextInt();
		System.out.print("Enter third number: ");
		int num3 = scn.nextInt();
		int total = num1+num2+num3;
		System.out.println("The total is: "+total);
		//Decision making
		//if-- true
		if(total<100) {
			System.out.println("Value is lesser than 100");
		}
		else {
			System.out.println("Greater than 100");
		}
		scn.close();
	}
}
}
public class Switch{
	public static void main(String[] args) {
		int month = 4;
		String monthString;
		switch(month) {
		case 1: monthString = "The month is Jan";break;
		case 2: monthString = "The month is Feb";break;
		case 3: monthString = "The month is Mar";break;
		case 4: monthString = "The month is Apr";break;
		case 5: monthString = "The month is May";break;
		case 6: monthString = "The month is Jun";break;
		default: monthString = "Invalid month";
		}
		System.out.print(monthString);
	}
}
}
