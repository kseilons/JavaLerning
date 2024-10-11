/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example;

import java.util.Scanner;

public class ColorRange {

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Введите код цвета: ");
        double code = sc.nextDouble();
        sc.close();
        String message;
        if (code < 380) {
            message = "Указанная длина волны не относится к видимому спектру";
        } else if (code < 450) {
            message = "Цвет — Фиолетовый";
        } else if (code < 495 ) {
            message = "Цвет — Синий";
        } else if (code < 570) {
            message = "Цвет — Зеленый";
        } else if (code < 590) {
            message = "Цвет — Желтый";
        } else if (code < 620) {
            message = "Цвет — Оранжевый";
        } else if (code < 750) {
            message = "Цвет — Красный";
        } else {
            message = "Указанная длина волны не относится к видимому спектру";
        }
        System.out.println(message);
    }
}
