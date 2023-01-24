package javaAssiginment;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

public class JavaQ23 {
	public static void main(String[] args) {
		String string = "30 March, 1997";

		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("d MMMM, yyyy", Locale.ENGLISH);
		LocalDate date = LocalDate.parse(string, formatter);

		System.out.println(date);
	}
}
