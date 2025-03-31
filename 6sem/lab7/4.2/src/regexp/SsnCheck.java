package regexp;

import java.util.Scanner;

public class SsnCheck {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String ssn;
		ssn = getSsn(in);
		System.out.println(validSsn(ssn)? "Valid" : "Not valid");
	}
	
	static boolean validSsn(String ssn) {
		return ssn.matches("[0-9]{3}-[0-9]{2}-[0-9]{4}");	
	}
	private static String getSsn(Scanner in) {
		System.out.println("Enter your SSN");
		return in.next();
	}

}