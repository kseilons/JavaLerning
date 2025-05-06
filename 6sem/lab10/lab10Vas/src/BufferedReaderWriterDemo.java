import java.io.*;

class BufferedReaderWriterDemo {
    public static void main(String[] args) {
        System.out.println("Начинается копирование файла");
        String path = "d:/documents/";
        String str;

        try {
            BufferedReader input = new BufferedReader(new FileReader(path + "MyNewText.txt"));
            BufferedWriter output = new BufferedWriter(new FileWriter(path + "MyFiles/MyVeryNewText.txt"));

            int k = 1;
            while((str = input.readLine()) != null) {
                output.write("[" + k + "] " + str.toLowerCase());
                output.newLine();
                k++;
            }

            input.close();
            output.close();
        }
        catch(FileNotFoundException e) {
            System.out.println("Файл не найден: " + e);
        }
        catch(IOException e) {
            System.out.println("Ошибка доступа к файлу: " + e);
        }

        System.out.println("Копирование файла завершено");
    }
}