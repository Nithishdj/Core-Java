package Tasks;

class Student{
	private String name;
	private int id;
	
	public String getName() {//get name
		return name;
	}
	public void setName(String name) {//set name
		this.name=name;
	}
	public int getId() {//get id
		return id;
	}
	public void setId(int id) {// set id
		this.id=id;
	}
}

public class EncapsulationEx{
	public static void main(String[] args) {
		Student obj = new Student();
		obj.setName("Nithish");
		System.out.println(obj.getName());
		obj.setId(42);
		System.out.println(obj.getId());
	}
}