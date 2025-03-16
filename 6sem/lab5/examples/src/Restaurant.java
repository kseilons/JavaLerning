import java.util.HashMap;
import java.util.Set;

public class Restaurant {
    public static void main(String[] args) {
        // Создание объекта HashMap
        HashMap<String, Integer> restaurantMenu = new HashMap<String, Integer>();

        // Добавление блюд с их стоимостью
        restaurantMenu.put("Пицца Хат", 130);
        restaurantMenu.put("Суши Сет", 250);
        restaurantMenu.put("Бургер Кинг", 200);
        restaurantMenu.put("Паста Карбонара", 180);
        restaurantMenu.put("Стейк", 500);

        // Вывод стоимости двух блюд
        System.out.println("Стоимость Пицца Хат: " + restaurantMenu.get("Пицца Хат") + " рублей.");
        System.out.println("Стоимость Суши Сет: " + restaurantMenu.get("Суши Сет") + " рублей.");

        // Вывод полного списка блюд
        System.out.println("\nМеню ресторана:");
        Set<String> menuItems = restaurantMenu.keySet();
        for (String item : menuItems) {
            System.out.println("Блюдо " + item + " стоит " + restaurantMenu.get(item) + " рублей.");
        }
    }
}
