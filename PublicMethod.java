package com.index;

class Greet{
	public void Msg() {
		System.out.println("Here is public class..accessed anywhere!");
	}
}
public class PublicMethod{
	public static void main(String[] args) {
		Greet obj = new Greet();
		obj.Msg();
	}
}