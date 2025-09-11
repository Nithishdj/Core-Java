package com.index;

class Calci{
	public int add(int a, int b) {// for adding two numbers
		return a+b;
	}
	public int add(int a, int b, int c) {//for adding three numbers
		return a+b+c;
	}
}
public class MethodOverloading{
	public static void main(String[] args) {
		Calci obj = new Calci();
		int result = obj.add(4, 10);
		System.out.println(result);
	}
}