package pattern;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegExpressionsMatcher {
    public static void main(String[] args) {
        // создаем шаблон
        Pattern p = Pattern.compile("(J|j)ava");
        
        // создаем исходную строку
        String str = "Java курсы — лучшие! Вы просто обязаны любить java.";
        
        // выводим содержимое строки на экран
        System.out.println(str);
        
        // инициализируем matcher
        Matcher m = p.matcher(str);
        
        // заменяем все вхождения шаблона на новую подстроку
        str = m.replaceAll("Oracle");
        
        // выводим измененную строку на экран
        System.out.println(str);
    } 
} 

