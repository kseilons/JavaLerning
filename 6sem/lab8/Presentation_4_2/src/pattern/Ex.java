package pattern;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Ex {
	public static void main(String[] args) {
		System.out.println("Введите номер телефона: ");
		Scanner in = new Scanner(System.in);
		String date = in.nextLine();
	
		Pattern phoneP = Pattern.compile("((8|\\+7)[\\- ]?)?(\\(?\\d{3}\\)?[\\- ]?)[\\d\\- ]{7,10}");
		Matcher phoneM = phoneP.matcher(date);
	
		
		if (phoneM.find()) {
			System.out.println("Телефон найден на индексе: " +phoneM.start());
			System.out.println(phoneM.group());
		}
		else {
			System.out.println("Телефон не найден: ");
		}
		
		in.close();
	}
}
