
package tip01;

import java.util.HashMap;
import java.util.Map;

public class Tip01 {
    public static void main(String[] args) {
        double taxRate  = 0.05, tipRate  = 0.15;
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
            double amount = entry.getValue();
            double total = amount * (1 + taxRate + tipRate);
            System.out.println(person + ": $" + String.format("%.2f", total));
        }
    }    
}
