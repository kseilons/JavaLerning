package pattern;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;

public class RegExGroups {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String date;
		Pattern dateP = Pattern.compile("([0-9]{2})/([0-9]{2})/([0-9]{4})");   //группы указываются в ()
		
		date = getDate(in, dateP);
		System.out.println("US style date - " + date);
		
		in.close();
	}
	
	static String getDate(Scanner in, Pattern dateP) {
		String date;
		Matcher dateM;
		boolean validDate = false;
		do {
			System.out.print("Enter a Date (dd/mm/yyyy): ");
			date = in.nextLine();
			dateM = dateP.matcher(date);   // Создаем объект Matcher
			
			if(dateM.matches()){     //проверяем соответствие строки шаблону
				
				//получаем данные из определенной группы
				String day = dateM.group(1);
				String month = dateM.group(2);
				String year = dateM.group(3);
				validDate = validateDate(date);
				
				if(dateM.matches() && validDate)  
					date = month + "/" + day + "/" + year;
				else
					System.out.println("Incorrect date entered");
			}
		}while(!(dateM.matches() && validDate));
		return date;
	}
	
	static boolean validateDate(String newDate) {
		DateFormat format = new SimpleDateFormat("dd/MM/yyyy");   //задаем формат даты
	
		format.setLenient(false);   //запрещает некорректные даты
		String date = newDate;
		
		try {
			format.parse(date);   //пытаемся преобразовать строку в дату
			return true;   //если получилось, дата корректна
		} catch (ParseException e) {   //исключение, которое выбрасывается при ошибке преобразования строки в дату
		System.out.println(date + " is not valid according to "
	                         + ((SimpleDateFormat) format).toPattern() + " pattern.");
		return false;
		}
	}
}
