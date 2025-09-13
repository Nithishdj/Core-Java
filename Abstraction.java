package com.index;
abstract class Shape{
	int a=2;
	public abstract void rect();
	public void cir() {
		System.out.println("Circle");
	}
	}
	class Pen extends Shape{
		public void rect() {//defining the abstract method
			System.out.println("Rectangle"+a);
		}
	}
	//main class
	public class Abstraction{
		public static void main(String[] args) {
			Pen obj = new Pen();
			Shape obj1 = new Pen();
			obj.rect();
			obj1.cir();
		}
	}
