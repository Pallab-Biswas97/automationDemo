package javaAssiginment;

public class JavaQ24 {
	public static void main(String[] args) {
		String str = "Pallab Biswas";
		String reversed = reverse(str);
		System.out.println("The reversed sentence is: " + reversed);
	}

	public static String reverse(String str) {
		if (str.isEmpty()) {
			return str;
		}

		return reverse(str.substring(1)) + str.charAt(0);
	}

}
