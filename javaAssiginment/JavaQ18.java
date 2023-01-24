package javaAssiginment;

public class JavaQ18 {

	public static void main(String[] args) {

		String line = "I am pallab biswas";
		int vowels = 0, consonants = 0;

		line = line.toLowerCase();
		for (int i = 0; i < line.length(); ++i) {
			char ch = line.charAt(i);
			if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
				++vowels;
			} else {
				++consonants;
			}
		}

		System.out.println("Vowels: " + vowels);
		System.out.println("Consonants: " + consonants);

	}
}
