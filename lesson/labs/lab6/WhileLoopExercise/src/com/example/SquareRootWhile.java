
package com.example;

import java.util.Scanner;


public class SquareRootWhile {
    public static void main(String args[]) {
        System.out.print("Type a non-negative integer: ");
        Scanner console = new Scanner(System.in);
        int number = console.nextInt();
        while (number < 0) {
            System.out.println("Недопустимое число, повторите попытку: ");
            number = console.nextInt();
        }
        console.close();
        System.out.println("Квадратный корень из " + number + " равен " + Math.sqrt(number));
    }
}
