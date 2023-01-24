package javaAssiginment;

public class JavaQ20 {

	public static void main(String[] args) {
		int first = 34, second = 12;

		System.out.println("Before swap " + first + " " + second);

		first = first - second;
		second = first + second;
		first = second - first;
		
		System.out.println("After swap " + first + " " + second);

	}

}
