package q26;

public class Programmer extends Employee {
	float bonus = 200.00f;

	public float getBonus() {
		return bonus;

	}

	public static void main(String[] args) {

		Programmer p = new Programmer();

		System.out.println("Employee salary - " + p.getSalary());
		System.out.println("Programmer bonus - " + p.getBonus());

	}

}
