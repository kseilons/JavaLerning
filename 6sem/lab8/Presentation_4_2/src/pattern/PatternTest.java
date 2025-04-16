package pattern;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PatternTest {

	public static void main(String[] args) {
		Pattern p = Pattern.compile("[A-F]{5,}.*");   //cоздаем объект Pattern с регулярным выражением
		String str="AAAAAhhh";
		System.out.println(isMatch(str, p));
	}
		
	//метод для проверки соответствия строки регулярному выражению
	private static boolean isMatch(String str, Pattern p){
		Matcher match = p.matcher(str);   //создаем Matcher для проверки строки
		return match.matches();   //проверяем соответствие строки шаблону
	}
}
