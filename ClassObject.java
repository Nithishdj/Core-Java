package com.index;
public class ClassObject{
	String name = "Nithi";
	int id =5;
	double salary = 25000;
	int bonus = 10000;
	public static void main(String[] args) {
	ClassObject obj = new ClassObject();
	ClassObject obj1 = new ClassObject();
	ClassObject obj2 = new ClassObject();
	ClassObject obj3 = new ClassObject();
	
	System.out.println(obj.id);
	System.out.println(obj1.name);
	System.out.println(obj2.salary);
	System.out.println(obj3.bonus);

	}
}