import java.util.ArrayList;
import java.util.List;

public class SampleFibonacci {
    // Метод fibonacci формирует и возвращает ArrayList
    public static List<Integer> fibonacci(int limit) {

        // Инициализируется список ArrayList
        List<Integer> itemsIds = new ArrayList<Integer>();

        int lo = 1;
        int hi = 1;
        itemsIds.add(lo);
        while (hi < limit) {
            itemsIds.add(hi); // Добавляется
            hi = lo + hi; // Изменение значения hi
            lo = hi - lo; /*
            Новое значение lo равно старому hi, то есть сумме
            за вычетом старого lo
            */
        }
        return itemsIds;
    }

    public static void main(String[] args) {
        List<Integer> listOfIntegers = fibonacci(50);
        for (int i = 0; i < listOfIntegers.size(); i++) {
            Integer I = listOfIntegers.get(i);
            System.out.println("Число Фибоначчи " + I);
        }
    }
}
