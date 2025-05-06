import java.nio.file.FileSystem;
import java.nio.file.FileSystems;
import java.nio.file.Path;

public class FileHandling7 {
    public static void main(String[] args) {
        // Способ 1: Использование FileSystems.getDefault()
        FileSystem fs = FileSystems.getDefault();
        Path path1 = fs.getPath("C:/java/JavaLerning/6sem/lab10/filehanding/employees.txt");
        System.out.println("Path 1 (using FileSystem): [" + path1 + "]");

        // Способ 2: Прямое использование Paths.get()
        Path path2 = Path.of("C:/java/JavaLerning/6sem/lab10/filehanding/employees.txt");
        System.out.println("Path 2 (using Path.of()): [" + path2 + "]");

        // Способ 3: С обратными слешами (экранирование)
        Path path3 = fs.getPath("C:\\java\\JavaLerning\\6sem\\lab10\\filehanding\\employees.txt");
        System.out.println("Path 3 (with escaped backslashes): [" + path3 + "]");

        // Сравнение путей
        System.out.println("\nPaths are equal:");
        System.out.println("Path1 == Path2: " + path1.equals(path2));
        System.out.println("Path1 == Path3: " + path1.equals(path3));
        
        // Дополнительная информация о пути
        System.out.println("\nPath details:");
        System.out.println("File name: " + path1.getFileName());
        System.out.println("Parent directory: " + path1.getParent());
        System.out.println("Root directory: " + path1.getRoot());
        System.out.println("Is absolute path: " + path1.isAbsolute());
    }
}