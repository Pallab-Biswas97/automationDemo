package javaAssiginment;

import java.util.Scanner;

// 3	Check Whether a string is Palindrome or Not

class palindromeChecker {
	void check(int i) {
		int temp = i, sum = 0;

		while (temp > 0) {
			int r = temp % 10;
			sum = (sum * 10) + r;
			temp = temp / 10;
		}

		if (i == sum) {
			System.out.println("The number " + i + " is a Palindrome number.");
		} else {
			System.out.println("The number " + i + " is not a Palindrome number.");
		}

	}

}

public class JavaQ03 {
	public static void main(String[] args) {
		int i;
		Scanner number = new Scanner(System.in);
		System.out.println("Enter the number -");
		i = number.nextInt();
		number.close();
		palindromeChecker number1 = new palindromeChecker();
		number1.check(i);
	}

}
