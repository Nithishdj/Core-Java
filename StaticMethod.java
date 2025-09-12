package com.index;
class Math{
	static int multiply(int a,int b) {
		return a*b;
	}
}
public class StaticMethod{
	public static void main(String[] args) {
		int result = Math.multiply(5,6);
		System.out.println(result);
	}
}
//don't need to create object 
//can call directly using class name
//static variable directly loaded in memory when created it