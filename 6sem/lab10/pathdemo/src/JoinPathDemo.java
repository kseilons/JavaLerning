import java.nio.file.Path;
import java.nio.file.Paths;

public class JoinPathDemo {
    public static void main(String[] args) {
        Path basicPath = Paths.get("C:/JavaProgramming");
        Path newPath = Paths.get("IO/Logs");
        
        System.out.println(basicPath.toString());
        System.out.println(newPath.toString());
        
        Path basicPath2 = basicPath.resolve(newPath.toString());
        Path newPath2 = newPath.resolve(basicPath.toString());
        
        System.out.println(basicPath2.toString());
        System.out.println(newPath2.toString());
    }
}