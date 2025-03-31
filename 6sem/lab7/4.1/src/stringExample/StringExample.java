package stringExample;

import java.util.ArrayList;
import java.util.List;

public class StringExample {
	public static void main(String[] args) {
		String str = "Sample String";
		
		displayString(str);
		displayStringBackWart(str);
		searchString(str, 'S');
		
		String toParse = "string to parse";
		for (String st: parseString(toParse)) {
			System.out.println(st);
		}
		
	}
	
	private static List<String> parseString(String str) {
		List<String> list = new ArrayList<>();
		
		int index = 0;
		
		for (int i = 0; i <str.length(); i++) {
			if (i == str.length() - 1 || str.charAt(i) == ' ') {
				list.add(str.substring(
						index == 0 ? index: index + 1, i + 1 
						));
				index = i;
			}
		}
		return list;
	}
	
	
	private static void searchString(String str, char c) {
		int count = 0;
		
		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) == c) {
				count++;
			}
		}
		
		System.out.println("The character " + c + " appears in the text " + count + " times");
	}
	
	private static void displayString(String str) {
		System.out.println(str);
		
		for (int i = 0; i < str.length(); i++) {
			System.out.println(str.charAt(i));
		}
	}
	
	private static void displayStringBackWart(String str) {
		String backward = "";
		
		for (int i = str.length() - 1; i >= 0; i--) {
			backward += str.substring(i, i+1);
		}
		System.out.println(backward);
	}
	
	

}
