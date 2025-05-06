import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.ArrayList;

public class FileHandling {
    public static void main(String[] args) {
        ArrayList<String> employees = new ArrayList<>();
        readFile(employees);
        displayEmployees(employees);
        writeFile(employees);
    }//end method main

    static void displayEmployees(ArrayList<String> employees) {
        for(String employee : employees) {
            System.out.println(employee);
        }
    }//end method displayEmployees

    static void readFile(ArrayList<String> employees) {
        String line = "";
        Path path = Paths.get("C:/java/JavaLerning/6sem/lab10/filehanding/employees.txt");
        
        try {
            BufferedReader fileInput = Files.newBufferedReader(path, Charset.forName("ISO-8859-1"));
            line = fileInput.readLine();
            while (line != null) {
                employees.add(line);
                line = fileInput.readLine();
            }//end while
            fileInput.close();
        } catch (IOException e) {
            System.out.println("Error reading file: " + e.getMessage());
        }//end try-catch
    }//end method readFile

    public static void writeFile(ArrayList<String> employees) {
        Path path = Paths.get("C:/java/JavaLerning/6sem/lab10/filehanding/userNames.txt");
        
        try {
            BufferedWriter bw = Files.newBufferedWriter(path,
                    Charset.forName("ISO-8859-1"),
                    StandardOpenOption.CREATE,
                    StandardOpenOption.TRUNCATE_EXISTING);
            
            for(String employee : employees) {
                bw.write(employee);
                bw.newLine();
            }//end for
            bw.close();
        } catch (IOException ioe) {
            System.out.println("Error writing to file.");
            System.exit(0);
        }//end try-catch
    }//end method writeFile
}//end class FileHandling