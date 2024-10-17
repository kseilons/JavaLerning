
package Tip02;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class CalculatorTest {
    public static void main(String[] args) {
        Calculator calc = new Calculator();
        Map<String, Double> initialAmounts = new HashMap<>();
        initialAmounts.put("Person 1", 10.0);
        initialAmounts.put("Person 2", 12.0);
        initialAmounts.put("Person 3", 9.0);
        initialAmounts.put("Person 4", 8.0);
        initialAmounts.put("Person 5", 7.0);
        initialAmounts.put("Person 6", 15.0);
        initialAmounts.put("Person 7", 11.0);
        initialAmounts.put("Person 8", 30.0);


        for (Map.Entry<String, Double> entry : initialAmounts.entrySet()) {
            String person = entry.getKey();
            calc.originalPrice = entry.getValue();
            calc.findTotal();
        }
        
    }
}
