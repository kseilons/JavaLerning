import java.io.BufferedReader;
import java.io.EOFException;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.FileReader;
import java.util.ArrayList;

public class FileReading {
    public static void main(String[] args) {
        ArrayList<String> employees = new ArrayList<>();
        readFile(employees);
        displayEmployees(employees);
    }//end method main

    static void displayEmployees(ArrayList<String> employees) {
        for(String employee : employees)
            System.out.println(employee);
        //endfor
    }//end method displayEmployees

    static void readFile(ArrayList<String> employees) {
        String line = "";
        BufferedReader fileInput = null;
        
        try {
            fileInput = new BufferedReader(new FileReader(new File("employees.txt")));
            line = fileInput.readLine();
            while (line != null) {
                employees.add(line);
                line = fileInput.readLine();
            }//end while
            fileInput.close();
        }
        catch (FileNotFoundException e) {
            System.out.println("File not found");
        }//end catch 
        catch (EOFException eofe) {
            System.out.println("No more lines to read.");
        }//end catch
        catch (IOException ioe) {
            System.out.println("Error reading file.");
        }//end catch
    }
}