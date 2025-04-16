package matrix;

import java.util.Scanner;

public class DriverMatrix {
    public static void main(String[] args) {
        Matrix tm = new Matrix(10);
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Треугольная матрица:");
        System.out.println("set - установить элемент");
        System.out.println("get - получить элемент");
        System.out.println("print - вывести матрицу");
        System.out.println("exit - выход");
        System.out.println("");
        
        
        while (true) {

        	System.out.println("Доступные команды");
            System.out.println("set, get, print, exit");
            String input = scanner.nextLine().trim();
            if (input.equalsIgnoreCase("exit")) {
                break;
            }
            String command = input.toLowerCase();
            
            
            switch (command) {
                case "get":
                    handleGetCommand(scanner, tm);
                    break;
                    
                case "set":
                    handleSetCommand(scanner, tm);
                    break;
                    
                case "print":
                    tm.printMatrix();
                    break;
                    
                default:
                    System.out.println("Неизвестная команда. Попробуйте снова.");
            }
        }
        
        scanner.close();
        System.out.println("Программа завершена.");
    }

    private static void handleGetCommand(Scanner scanner, Matrix tm) {
        try {
            System.out.print("Введите строку: ");
            int row = Integer.parseInt(scanner.nextLine());
            System.out.print("Введите столбец: ");
            int col = Integer.parseInt(scanner.nextLine());
            System.out.println("Элемент [" + row + "," + col + "]: " + tm.get(row, col));
        } catch (NumberFormatException e) {
            System.out.println("Ошибка: неверный формат числа");
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Ошибка: индекс за пределами матрицы");
        } catch (Exception e) {
            System.out.println("Ошибка: " + e.getMessage());
        }
    }

    private static void handleSetCommand(Scanner scanner, Matrix tm) {
        try {
            System.out.print("Введите строку: ");
            int row = Integer.parseInt(scanner.nextLine());
            System.out.print("Введите столбец: ");
            int col = Integer.parseInt(scanner.nextLine());
            System.out.print("Введите значение: ");
            int value = Integer.parseInt(scanner.nextLine());
            tm.set(row, col, value);
            System.out.println("Установлено [" + row + "," + col + "] = " + value);
        } catch (NumberFormatException e) {
            System.out.println("Ошибка: неверный формат числа");
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Ошибка: индекс за пределами матрицы");
        } catch (Exception e) {
            System.out.println("Ошибка: " + e.getMessage());
        }
    }
}
