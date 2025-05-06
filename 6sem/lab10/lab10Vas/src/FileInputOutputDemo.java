import java.io.*;

class FileInputOutputDemo {
    public static void main(String[] args) {
        System.out.println("Начинается копирование файла");
        String path = "d:/documents/";
        int bt;

        try {
            FileInputStream input = new FileInputStream(path + "MyFiles/MyCV.pdf");
            FileOutputStream output = new FileOutputStream(path + "MyData.pdf");

            bt = input.read();
            while(bt != -1) {
                output.write(bt);
                bt = input.read();
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