package com.example;

import java.util.Scanner;

public class Divisors {

    public static void main(String args[]) {
        Scanner console = new Scanner(System.in);

        System.out.print("Enter the number: ");
        int num = console.nextInt();

        System.out.print("Divisors of " + num + " = ");

        // Примененные переменные цикла:
        //   - i: переменная, которая используется для перебора чисел от 1 до (num - 1).
        // Логика цикла:
        //   - Перебор всех чисел от 1 до num - 1 и проверка на делимость num.
        // Число итераций:
        //   - Цикл выполняется (num - 1) раз.
        for (int i = 1; i < num; i++) {
            // Примененное условие:
            //   - Проверяем, делится ли num на i без остатка.
            //   - Если num % i не равно 0, то это значит, i не является делителем num.
            if (num % i != 0) {
                continue; // Управление потоком в цикле:
                //   - переходим к следующей итерации если i - не делитель числа.
            }
            // Если i является делителем num, выводим его.
            System.out.print(i + " , ");
        }
    }
}
