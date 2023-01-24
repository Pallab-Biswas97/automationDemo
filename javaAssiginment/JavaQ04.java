package javaAssiginment;

import java.util.Scanner;

class arrayAverage {
	public double calculateAverage(int[] array) {

		double average;
		double sum = 0;

		for (int i = 0; i < array.length; i++) {
			sum += array[i];
		}

		average = sum / array.length;

		return average;
	}
}

public class JavaQ04 {

	public static void main(String args[]) {
		int n;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the array size - ");
		n = sc.nextInt();
		int[] array = new int[n];
		System.out.println("Enter " + n + " array elements of int type - ");
		for (int i = 0; i < n; i++) {
			array[i] = sc.nextInt();
		}
		sc.close();
		arrayAverage arr = new arrayAverage();
		double result = arr.calculateAverage(array);

		System.out.format("%.3f", result);

	}

}
