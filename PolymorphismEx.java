package Tasks;

class A{
	public void show() {
		System.out.println("Showing A!");
	}
}
class B extends A{
	public void show() {
		System.out.println("Showing B!");
	}
}
class C extends A{
	public void show() {
		System.out.println("Showing C!");
	}
}

public class PolymorphismEx{
	public static void main (String[] args) {
		A obj = new A();
		obj.show();
		
		obj = new B();
		obj.show();
		
		obj = new C();
		obj.show();
	}
}