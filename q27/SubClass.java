package q27;

public class SubClass extends SuperClass{
	
	int b = 20;
	
	public int getB() {
		return b;
	}

	public static void main(String[] args) {
		int c = new SuperClass().getA();
		int d = new SubClass().getB();
		System.out.println(c+" "+d);

	}

}
