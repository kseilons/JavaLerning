package accountgenerator;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Employee {
	private final String name;
    private final String username;
    private final String email;
    private String password;
    
    //конструктор
    public Employee() {
        name = setName();
        username = setUserName(name);
        email = setEmail(username);
        password = setPassword(username);
    }
    
    //переопределение метода toString()
    @Override
    public String toString() {
        return "Employee Details\n" +
               "Name               : " + name + "\n" +
               "Username           : " + username + "\n" +
               "Email              : " + email + "\n" +
               "Initial Password   : " + password;
    }
    
    //подсчет количества вхождений символа в строке
    private int countChars(String str, char ch) {
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == ch) {
                count++;
            }
        }
        return count;
    }
    
    //запрос имени сотрудника
    private String setName() {
        Scanner scanner = new Scanner(System.in);
        String inputName;
        
        
        //регулярное выражение для проверки имени и фамилии
        Pattern pattern = Pattern.compile("[A-Za-z]+ [A-Za-z]+");
        Matcher matcher;
        

        do {
            System.out.print("Введите имя и фамилию: ");
            inputName = scanner.nextLine();

            //создаем объект Matcher
            matcher = pattern.matcher(inputName);

            //проверяем, соответствует ли введенное имя формату "Имя Фамилия"
            if (!matcher.matches()) {
                System.out.println("Неправильный формат имени!!!");
            }
        } while (!matcher.matches()); // Повторяем до правильного ввода
        
        /*int count;

        do {
            System.out.print("Введите имя и фамилию: ");
            inputName = scanner.nextLine();
            count = countChars(inputName, ' ');
        } while (count != 1); //повторяем, пока не будет ровно один пробел*/

        return inputName;
    }
    
    //метод для генерации имени пользователя
    private String setUserName(String name) {
        return name.toLowerCase().replace(" ", ".");
    }

    //метод для генерации email
    private String setEmail(String username) {
        return username.charAt(0) + username.substring(username.indexOf('.') + 1) + "@oracleacademy.Test";
    }
    
    //метод для генерации пароля
    private String setPassword(String username) {
    	String password;
    	if (username.length() > 8) {
    	    password = username.substring(0, 8);
    	} else {
    	    password = username;
    	}
        
        //если username короче 8 символов, дополняем '*'
        while (password.length() < 8) {
            password += "*";
        }

        //заменяем гласные буквы на '*'
        password = password.replaceAll("[aeiou]", "*");
        
        //первую найденную букву делаем заглавной
        for (int i = 0; i < password.length(); i++) {
            char ch = password.charAt(i);
            if (ch >= 'a' && ch <= 'z') {  //проверяем, является ли символ буквой
                char upperChar = Character.toUpperCase(ch);   //делаем заглавной
                return password.substring(0, i) + upperChar + password.substring(i + 1);
            }
        }
        return password;
    }
}
