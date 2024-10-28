package labs.lab5.practic4;

import java.util.Scanner;

public class ProcessName {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Введите ваше имя: ");
            String fullName  = sc.nextLine();
            int indSpace = fullName.indexOf(" ");
            System.out.println(indSpace);
            String initial = fullName .substring(0 , 1);
            String lastName = fullName .substring(indSpace + 1);
            System.out.println("Ваше имя: " + lastName + ", " + initial + '.');
        }
        
    }
}
