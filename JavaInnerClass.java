package com.index;

class OutterClass{
	int x = 10;
	class InnerClass{
		int y = 15;//2nd class --> inner class
	}
}

public class JavaInnerClass {
public static void main(String[] args) {
	OutterClass myOuter = new OutterClass();
	//OutterClassName.InnerClassName InnerClassObject = OuterClassObject.new Innerclass();
	OutterClass.InnerClass myInner = myOuter.new InnerClass();
	System.out.println(myInner.y+myOuter.x);
}
}
