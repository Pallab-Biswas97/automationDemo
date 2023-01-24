package q25;

public class Employee extends Salary implements Person {

	@Override
	public void walk() {
		System.out.println("The employee can walk.");
	}

}
