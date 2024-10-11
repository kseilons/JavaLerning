/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example;


import java.util.Scanner;

public class TrafficLightChecker {

    public static void main(String args[]) {
        System.out.print("Введите код цвета светофора:");
        Scanner sc = new Scanner(System.in);
        int code = sc.nextInt();
        sc.close();
        String color;
        switch (code) {
            case 1:
                color = "зеленый";
                break;
            case 2:
                color = "желтый";
                break;
            case 3:
                color = "красный";
                break;
            default:
                System.out.println("Недопустимый цвет");
                return;
        }
        System.out.println("Следующий сигнал светофора " + color);
    }
}
