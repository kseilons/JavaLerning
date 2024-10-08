package start.src;

import java.io.*;

public class FileAndDir {
    public static void main(String[] args) throws Exception {
        File file = new File("temp.txt");
        if (!file.exists()) {
            file.createNewFile();
        }
        if (file.isDirectory()) {
            System.err.println("dir");
        } else if  (file.isFile()) {
            System.out.println("file");
        } 

        try (FileWriter fileWriter = new FileWriter(file);
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
            FileReader fileReader = new FileReader(file);
            BufferedReader bufferedReader = new BufferedReader(fileReader)) {
            fileWriter.write("str1\n");
            fileWriter.write("str2\n");

            bufferedWriter.write("str3");
            bufferedWriter.newLine();
            bufferedWriter.write("str4");

            while (bufferedReader.ready()) {
                System.out.println(bufferedReader.readLine());
            }
        }
    }
}
