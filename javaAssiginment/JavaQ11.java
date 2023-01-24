package javaAssiginment;

import java.util.ArrayList;
import java.util.Arrays;

public class JavaQ11 {

	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<>();
		list.add("Pallab");
		list.add("Biswas");
		System.out.println("The list - " + list);

		String[] arr = new String[list.size()];

		list.toArray(arr);

		System.out.println("The array from list - ");
		for (String item : arr) {
			System.out.print(item + ", ");
		}
		System.out.println();

		ArrayList<String> list1 = new ArrayList<>(Arrays.asList(arr));

		System.out.println("The list from array - " + list1);

	}

}
