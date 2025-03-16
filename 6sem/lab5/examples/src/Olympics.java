import java.util.ArrayList;

public class Olympics {
    public static void main(String[] args) {
        // Создание списка олимпийских видов спорта
        ArrayList<String> olympicSports = new ArrayList<>();

        // Добавление элементов в список
        olympicSports.add("Стрельба из лука");
        olympicSports.add(0, "Бокс");
        olympicSports.add(0, "Крикет");
        olympicSports.add(0, "Прыжки в воду");

        // Вывод количества видов спорта
        System.out.println("В списке представлены " + olympicSports.size() + " олимпийских видов спорта:");

        // Вывод элементов списка
        for (String sport : olympicSports) {
            System.out.println(sport);
        }
    }
}
