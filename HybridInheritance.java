package com.index;
//hybrid inheritance
class HumanBody{//single inheritance
	public void displayHuman() {
		System.out.println("About human body");
	}
}
interface male{
	public void show();
}
interface female{
	public void show();
}
public class HybridInheritance extends HumanBody implements male,female {
	public void show() {
		System.out.println("Implementation of both female and male are showed");
	}
	public void displayHybrid() {
		System.out.println("Implementation of hybrid inheritance in java");
	}
public static void main(String[] args) {
	HybridInheritance obj = new HybridInheritance();
	obj.displayHuman();
	obj.show();
	obj.displayHybrid();
}
}
