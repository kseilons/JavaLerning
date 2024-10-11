/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package src.com.example;

import java.util.Scanner;

public class ValidatePin {

    public static void main(String[] args) {
        int correct_pin = 1234;
        System.out.println("Введите ПИН-код: ");
        Scanner sc = new Scanner(System.in);
        int pin;
        while (true) {
            pin  = sc.nextInt();
            if (pin == correct_pin) {
                break;
            }
            System.out.println("Введите правильный ПИН-код");
        }
        sc.close();
        System.out.println("Вы ввели верный ПИН-код. Доступ к счету разрешен");
    }
}
