/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example;


import java.util.Scanner;


public class ComputeBMI {
    public static void main(String[] args)
	{
        Scanner sc = new Scanner(System.in);
        System.out.print("Вы мужчина? (Y/n):");
        String gender = sc.nextLine();
        System.out.print("Введите вес в кг:");
        double weight = sc.nextDouble();
        System.out.print("Введите рост в метрах:");
        double height = sc.nextDouble();
        sc.close();
        double BMI = Math.round(weight / (height * height) * 10.0) / 10.0;
        System.out.println("Индекс массы вашего тела равен " + BMI);

        double[] maleThresholds = {18.5, 23.8, 28.5, 38.9};
        double[] femaleThresholds = {20.1, 24.9, 29.9, 39.9};

        String[] diagnosis = {"Ниже нормы", "Норма", "Ожирение 1 степени", "Ожирение 2 степени", "Ожирение 3 степени"};

        double[] thresholds = gender.compareToIgnoreCase("Y") == 0 ? maleThresholds : femaleThresholds;

        String diagnos = diagnosis[diagnosis.length - 1];
        for (int i = 0; i < thresholds.length; i++) {
            if (BMI <= thresholds[i]) {
                diagnos = diagnosis[i];
                break;
            }
        }
        System.out.println("У вас " + diagnos);
    }
}



//        String diagnosis;
//        if (gender.compareToIgnoreCase("Y") == 0) {
////            Мужчина
//            if (BMI < 18.5) {
//                diagnosis = "Ниже нормы";
//            } else if (BMI <= 23.8) {
//                diagnosis = "Норма";
//            } else if (BMI <= 28.5) {
//                diagnosis = "Ожирение 1 степени";
//            } else if (BMI <= 38.9) {
//                diagnosis = "Ожирение 2 степени";
//            } else {
//                diagnosis = "Ожирение 3 степени";
//            }
//        } else {
////            Женщина
//            if (BMI < 20.1) {
//                diagnosis = "Ниже нормы";
//            } else if (BMI <= 24.9) {
//                diagnosis = "Норма";
//            } else if (BMI <= 29.9) {
//                diagnosis = "Ожирение 1 степени";
//            } else if (BMI <= 39.9) {
//                diagnosis = "Ожирение 2 степени";
//            } else {
//                diagnosis = "Ожирение 3 степени";
//            }
//        }
//        System.out.println("У вас " + diagnosis);
