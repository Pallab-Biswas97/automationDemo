package javaAssiginment;

import java.util.Arrays;

public class JavaQ07 {

	public static void main(String[] args) {

		char[] ch = { 'P', 'a', 'l', 'l', 'a', 'b' };

		String st1 = String.valueOf(ch);
		String st2 = new String(ch);

		System.out.println(st1);
		System.out.println(st2);

		char[] chars = st1.toCharArray();
		System.out.println(Arrays.toString(chars));

	}

}
