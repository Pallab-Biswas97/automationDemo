package q30;

public class SubClass extends SuperClass {

	void walk() {
		System.out.println("The person cannot walk");
		super.walk();
	}

	public static void main(String[] args) {
		SubClass obj = new SubClass();
		obj.walk();
	}
}
