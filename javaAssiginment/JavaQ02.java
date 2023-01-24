package javaAssiginment;

import java.util.Scanner;

// 2	Display Fibonacci Series

class Fibonacci {
	/**
	 * @param i
	 */
	void printSeries(int i) {
		
		int n=i, firstTerm = 0, secondTerm = 1;
		
		for (int j =0 ; j<n; j++) {
			System.out.print(firstTerm + ",");
			
			int nextTerm = 	firstTerm + secondTerm;
			firstTerm = secondTerm;
			secondTerm = nextTerm;
			
		}

	}

}

public class JavaQ02 {
	public static void main(String[] args) {
		int i;
		Scanner number = new Scanner(System.in);
		System.out.println("Enter the nth number to print the fibonacci series up to n number -");
		i = number.nextInt();
		number.close();
		Fibonacci number1 = new Fibonacci();
		number1.printSeries(i);
	}

}
