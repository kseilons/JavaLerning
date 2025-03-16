package country;

import java.util.HashSet;
import java.util.Set;

public class CountryList {
    public static void main(String[] args) {
        Set<String> countries = new HashSet<>();
        
        countries.add("Россия");
        countries.add("США");
        countries.add("Германия");
        countries.add("Япония");
        countries.add("Франция");
        countries.add("США"); // Дубликат
        
        System.out.println("Список стран: " + countries);
    }
}

