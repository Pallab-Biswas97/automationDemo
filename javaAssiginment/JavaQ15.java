package javaAssiginment;

import java.util.Scanner;

public class JavaQ15 {

	public static void main(String[] args) {
		char c;
		System.out.println("Enter character - ");
		Scanner sc = new Scanner(System.in);
		c=sc.next().charAt(0);
		sc.close();

		if ((c >= 'a' && c <= 'z') || (c >= 'A' && c <= 'Z'))
			System.out.println(c + " is an alphabet.");
		else
			System.out.println(c + " is not an alphabet.");

	}

}
