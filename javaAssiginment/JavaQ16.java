package javaAssiginment;

import java.util.Scanner;

public class JavaQ16 {

	public static void main(String[] args) {
		int num;
		System.out.println("Enter the number - ");
		Scanner sc = new Scanner(System.in);
		num = sc.nextInt();
		sc.close();
		for (int i = 1; i <= 10; ++i) {
			System.out.printf("%d * %d = %d \n", num, i, num * i);
		}

	}

}
