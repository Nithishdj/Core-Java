package com.index;
public class Encapsulation{
	private String name;
	public String getName() {
		return name;
	}
	public void setName(String newname) {
		this.name=newname;
	}
	private int Rollno;
	public int getRollno() {
		return Rollno;
	}
	public void setRollno(int newRollno) {
		this.Rollno=newRollno;
	}
	public static void main(String[] args) {
		Encapsulation obj = new Encapsulation();
		obj.setName("Nithish");
		obj.setRollno(5);
		System.out.println(obj.getName());
		System.out.print(obj.getRollno());
	}
}