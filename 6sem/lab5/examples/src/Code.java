import java.util.*;

public class Code {
    public static void main(String[] args) {
        Map<String, Integer> mapOfIntegers = createMapOfIntegers();
        Set<String> keys = mapOfIntegers.keySet();

        for (String key : keys) {
            Integer value = mapOfIntegers.get(key);
            System.out.println("Month " + key + " количество дней = " + value);
        }
    }

    public static Map<String, Integer> createMapOfIntegers() {
        Map<String, Integer> mapOfIntegers = new HashMap<String, Integer>();

        mapOfIntegers.put("january", Integer.valueOf(31));
        mapOfIntegers.put("february", Integer.valueOf(28));
        mapOfIntegers.put("march", Integer.valueOf(31));
        mapOfIntegers.put("april", Integer.valueOf(30));
        mapOfIntegers.put("may", Integer.valueOf(31));
        mapOfIntegers.put("june", Integer.valueOf(30));
        mapOfIntegers.put("july", Integer.valueOf(31));
        mapOfIntegers.put("august", Integer.valueOf(31));
        mapOfIntegers.put("september", Integer.valueOf(30));
        mapOfIntegers.put("october", Integer.valueOf(31));
        mapOfIntegers.put("november", Integer.valueOf(30));
        mapOfIntegers.put("december", Integer.valueOf(31));

        return mapOfIntegers;
    }
}
