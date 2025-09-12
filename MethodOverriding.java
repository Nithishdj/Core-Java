package com.index;
class Calculator{
	public int add(int a, int b) {
		return a+b;
	}
}
class AdvCalci extends Calculator{
	public int add(int a, int b) {
		return a+b+100;
	}
}
public class MethodOverriding{
	public static void main(String[] args) {
		AdvCalci obj = new AdvCalci();
		int result = obj.add(5,5);
		System.out.println(result);
	}
}