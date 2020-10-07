package Utiles;

import java.util.regex.Pattern;

public class Validaciones {
	public static boolean validateLetters(String name) {
		return Pattern.matches("[a-zA-Z\\s]+", name);
	}

	public static boolean validateISBN(String name) {
		return Pattern.matches("[0-9]+", name);
	}

	public static boolean isNumberFloat(String name) {
		try {
			Float.parseFloat(name);
			char charAt = name.charAt(name.length() - 1);
			if (charAt == 'f' || charAt == 'd') {
				return false;
			}
		} catch (NumberFormatException e) {
			// TODO: handle exception
			return false;
		}
		return true;
	}
}
