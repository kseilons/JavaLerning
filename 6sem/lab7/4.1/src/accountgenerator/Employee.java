package accountgenerator;

import java.util.Scanner;

public class Employee {

	private String name;
	private String username;
	private String email;
	private String password;
	
	public Employee() {
		name = setName();
		username = setUsername(name);
		email = setEmail(username);
		password = setPassword(username);
		
	}
	
	private String setName() {
		Scanner scanner = new Scanner(System.in);
		String name;
		do {
			System.out.println("Input data: ");
			name = scanner. nextLine();
		}
		while (countChars(name, ' ') != 1);
		
		scanner.close();
		
		return name;
	}
	
	private String setUsername(String name) {
		StringBuilder build = new StringBuilder();
		
		build.append(name.toLowerCase().substring(0, name.indexOf(' ')) +"."+ name.toLowerCase().substring(name.indexOf(' ') +1, name.length()));
		return build. toString();
	}
	
	private String setEmail(String username) {
		StringBuilder build = new StringBuilder();
		build.append(
			username.toLowerCase().charAt(0) +
			username. substring(username. indexOf('.') + 1, username.length()) +
			"@oracleacademy.Test");
		return build.toString();
	}

	public String setPassword(String username) {
		StringBuilder build = new StringBuilder();

		build.append(username.toUpperCase().charAt(0) +
		username.toLowerCase().replaceAll("[aeiou]", "*").substring(1, 8));

		return build.toString();

	}

		private int countChars(String str, char c) {
			int count = 0;
			for (int i = 0; i < str.length(); i++) {
				if (str.charAt(i) == c) {
					count ++ ;
				}
			}
			return count;
		}
			
		public String toString() {
			return "Name " + name +
			"\nUsername " + username +
			"\nEmail " + email +
			"\nInitial Password " + password;

		}
}