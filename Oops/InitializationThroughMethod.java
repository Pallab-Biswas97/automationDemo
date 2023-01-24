package Oops;

class Student {
	int rollNo;
	String name;

	void insertRecord(int r, String n) {
		rollNo = r;
		name = n;

	}

	void displayInformation() {
		System.out.println(rollNo + " " + name);
	}
}

class InitializationThroughMethod {
	public static void main(String args[]) {

		Student s1 = new Student();
		Student s2 = new Student();

		s1.insertRecord(111, "Karan");
		s2.insertRecord(222, "Aryan");
		s1.displayInformation();
		s2.displayInformation();

	}
}
