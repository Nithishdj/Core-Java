package com.index;

public class CopyConstructor {
int empId;
String empName;

CopyConstructor(int id,String name){
	this.empId=id;
	this.empName=name;
}
CopyConstructor(CopyConstructor copy){
	this.empId=copy.empId;
	this.empName=copy.empName;
}
public static void main(String[] args) {
	CopyConstructor obj = new CopyConstructor(05,"Agal");
	System.out.println(obj.empId);
	System.out.print(obj.empName);
}
}
