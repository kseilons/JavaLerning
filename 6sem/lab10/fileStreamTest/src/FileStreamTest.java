import java.io.*;

public class FileStreamTest {
    public static void main(String[] args) {
        File file = new File("C:\\java\\JavaLerning\\6sem\\lab10\\filehanding/employees.txt");
        BufferedReader reader = null;

        try {
            FileReader fileReader = new FileReader(file);
            reader = new BufferedReader(fileReader);

            String line;
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }

        } catch (FileNotFoundException e) {
            System.out.println("Файл не найден: " + file.getPath());
        } catch (IOException e) {
            System.out.println("Ошибка при чтении файла: " + e.getMessage());
        } finally {
            try {
                if (reader != null) {
                    reader.close();
                }
            } catch (IOException e) {
                System.out.println("Ошибка при закрытии файла.");
            }
        }
    }
}
