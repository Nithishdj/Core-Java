package com.index;

interface shape{
	double getArea();
}

class Rectangle implements shape{
	private double length;
	private double width;
	
	public Rectangle(double length, double width) {
		this.length=length;
		this.width=width;
	}
	public double getArea() {
		return length*width;
	}
}

class Triangle implements shape{
	private double base;
	private double height;
	
	public Triangle(double base, double height) {
		this.base=base;
		this.height=height;
	}
	public double getArea() {
		return 0.5*base*height;
	}
}

class Circle implements shape{
	private double radius;
	
	public Circle(double radius) {
		this.radius=radius;
	}
	public double getArea() {
		return 3.14*radius;
	}
}

public class InterfacePrgm {
public static void main(String[] args) {
	
	//creating obj using class with interface
	//interfacename objname = new className();
	//interfacename objname = new className();

	shape rectangle = new Rectangle(44,32);
	shape triangle = new Triangle(8.0,9.0);
	shape circle = new Circle(5.0);
	
	System.out.println("Area of rectangle: "+rectangle.getArea());
	System.out.println("Area of triangle: "+triangle.getArea());
	System.out.println("Area of circle: "+circle.getArea());
}
}
