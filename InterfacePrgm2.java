package com.index;

interface a1{
	public void show();
}
interface b1{
	public void show1();
}
class InterfacePrgm2 implements a1,b1{
	public void show() {
		System.out.println("show from a1");
	}
	public void show1() {
		System.out.println("show from b1");
	}
	public static void main(String[] args) {
		InterfacePrgm2 obj = new InterfacePrgm2();
		obj.show();
		obj.show1();
	}
}



