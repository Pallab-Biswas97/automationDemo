package javaAssiginment;

import java.util.Scanner;

// 1 Check Whether a Number is Prime or Not

class primeChecker {
	void check(int j) {

		int i, m = 0, flag = 0;
		int n = j;
		m = n / 2;

		if (n == 0 || n == 1) {
			System.out.println("The number " + j + " is bot a prime number.");
		} else {
			for (i = 2; i <= m; i++) {
				if (n % i == 0) {
					System.out.println("The number " + j + " is not a prime number.");
					flag = 1;
					break;
				}
			}
			if (flag == 0) {
				System.out.println("The number " + n + " is a prime number");
			}
		}
	}
}

public class JavaQ01 {
	public static void main(String[] args) {
		int i;
		Scanner number = new Scanner(System.in);
		System.out.println("Enter the number -");
		i = number.nextInt();
		number.close();
		primeChecker number1 = new primeChecker();
		number1.check(i);
	}

}
