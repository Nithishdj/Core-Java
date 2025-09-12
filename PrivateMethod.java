package com.index;
class Myclass{
	private void display() {
		System.out.println("Hello from private method");
	}
	public void callDisplay() {
		display();
	}
}
public class PrivateMethod{
	public static void main(String[] args) {
		Myclass obj = new Myclass();
		obj.callDisplay();
	}
}