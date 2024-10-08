package input04;

import java.io.InputStream;
import java.util.Scanner;

public class Input05 {
    public static void main(String[] args) {
        InputStream inputStream = Input05.class.getResourceAsStream("Level05.txt");
        if (inputStream == null) {
            System.err.println("Файл Level05.txt не найден!");
            return;
        }
        Scanner sc = new Scanner(inputStream);

        while (sc.hasNextLine()) {
            String line = sc.nextLine();
            // Пропускаем строку, если она начинается с двух слешов
            if (line.startsWith("//")) {
                continue;
            }
            String[] parts = line.split("\\s+"); // Разделяем строку по пробелам

            if (parts.length >= 3) { // Проверяем, достаточно ли частей в строке
                String name = parts[0];
                try {
                    int x = Integer.parseInt(parts[1]);
                    int y = Integer.parseInt(parts[2]);
                    System.out.println(name + ":\n x = " + x + ", y = " + y);
                } catch (NumberFormatException e) {
                    System.err.println("Ошибка при парсинге координат в строке: " + line);
                }
            } else {
                System.out.println(line); // Выводим строку как есть, если координат нет
            }
        }

        sc.close();
    }
}
