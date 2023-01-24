package javaAssiginment;

import java.util.Arrays;

public class JavaQ06 {
	public static void main(String args[]) {
		int[] arr1 = { 1, 2, 3 };
		int[] arr2 = { 4, 5, 6 };
		int[] arrC = new int[arr1.length + arr2.length];

		System.arraycopy(arr1, 0, arrC, 0, arr1.length);
		System.arraycopy(arr2, 0, arrC, arr1.length, arr2.length);

		System.out.println(Arrays.toString(arrC));
	}

}
