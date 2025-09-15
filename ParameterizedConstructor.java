package com.index;

public class ParameterizedConstructor {
int empId;
String empName;//variable in heap memory

ParameterizedConstructor(int id,String name){
	//id and name are temp variable
	empId = id;
	empName = name;
}
public static void main(String[] args) {
	ParameterizedConstructor myobj = new ParameterizedConstructor(42,"Nithish");
	System.out.println(myobj.empId);//empid will be called in stack memory
	System.out.println(myobj.empName);
}
}
