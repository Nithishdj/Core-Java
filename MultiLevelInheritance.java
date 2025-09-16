package com.index;

class MultiOne{
	void one() {
		System.out.println("This is base class");
	}
}
class MultiSecond extends MultiOne{
	void second() {
		System.out.println("This is intermediate class");
	}
}
class MultiThird extends MultiSecond{
	void third() {
		System.out.println("This is derived class");
	}
}

public class MultiLevelInheritance {
public static void main(String[] args) {
	MultiThird obj = new MultiThird();
	obj.one();
	obj.second();
	obj.third();
}
}
