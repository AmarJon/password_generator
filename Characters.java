package password_generator;

import java.util.Random;

public class Characters {
	
	public Characters() {
		// constructor
	}
	
	public static char getLowerCase() {
		int lower =  (int) Math.floor(97 + Math.random()*(122-97));
		char c = (char)lower;
		return c;
	}
	
	public static char getUpperCase() {
		int upper = (int) Math.floor(65 + Math.random()*(90-65));
		char c = (char)upper;
		return c;
	}
	
	public static char getSymbols() {
		int symbols = (int) Math.floor(33 + Math.random()*(47-33));
		char c = (char)symbols;
		return c;
	}
	
	public static char getNumbers() {
		int numbers = (int) Math.floor(48 + Math.random()*(57-48));
		char c = (char)numbers;
		return c;
	}
	
	public static String getPassword() {
		String getPasswordString = (getLowerCase() + "" + getUpperCase() + "" + getSymbols() + "" + getNumbers());
		return getPasswordString;
	}
	
// Why make this not a static method?
	public String finalPassword() {
		Random rnd = new Random();
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < 12; i++)
			sb.append(getPassword().charAt(rnd.nextInt(getPassword().length())));
		return sb.toString();
	}	
}
