import java.nio.file.FileSystem;
import java.nio.file.FileSystems;
import java.nio.file.Path;

public class PathTest {
    public static void main(String[] args) {
        // 1. Создаем экземпляр FileSystem
        FileSystem fs = FileSystems.getDefault();
        
        // 2. Создаем Path для указанной структуры
        Path path = fs.getPath("C:", "JavaProgramming", "NIO2", "DemoFile.txt");
        
        // 3. Выводим путь
        System.out.println("Constructed Path: " + path);
    }
}