import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class FilesCheckDemo {
    public static void main(String[] args) {
        // Создаем Path для проверяемого файла/директории
        Path path = Paths.get("C:/JavaProgramming/IO2");
        
        // Проверяем существование пути
        boolean pathExists = Files.exists(path);
        
        // Выводим результат
        System.out.println("Exists? " + pathExists);
    }
}