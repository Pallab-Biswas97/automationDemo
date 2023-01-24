package javaAssiginment;

public class JavaQ08 {
	public static void main(String[] args) {

		int[] num = { 5, 7, 2, 8, 5, 6, 9, 3 };
		int numToFind = 3;
		boolean found = false;

		for (int i = 0; i < num.length; i++) {
			if (i == numToFind) {
				found = true;
				break;
			}
		}

		if (found)
			System.out.println(numToFind + " is found.");
		else
			System.out.println(numToFind + " is not found.");
	}

}
