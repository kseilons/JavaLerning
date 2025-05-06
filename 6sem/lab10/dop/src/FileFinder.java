import java.io.File;
import java.util.Scanner;

public class FileFinder {
    public static void main(String[] args) {
        if (args.length == 0) {
            System.out.println("Ошибка: не указан каталог для поиска.");
            return;
        }

        String directoryPath = args[0];
        String extension = args.length > 1 ? args[1] : "";
      
        if (directoryPath.isEmpty()) {
            System.out.println("Ошибка: каталог не указан.");
            return;
        }

        File directory = new File(directoryPath);
        if (!directory.exists() || !directory.isDirectory()) {
            System.out.println("Ошибка: каталог не существует или это не каталог.");
            return;
        }

        File[] files = directory.listFiles();
        if (files == null || files.length == 0) {
            System.out.println("В каталоге нет файлов.");
            return;
        }

        System.out.println("\nРезультаты поиска:");
        boolean found = false;

        for (File file : files) {
            if (file.isFile()) {
                String fileName = file.getName();
                if (extension.isEmpty() || fileName.toLowerCase().endsWith("." + extension.toLowerCase())) {
                    System.out.println(fileName);
                    found = true;
                }
            }
        }

        if (!found) {
            System.out.println("Файлов с указанным расширением не найдено.");
        }
    }
}