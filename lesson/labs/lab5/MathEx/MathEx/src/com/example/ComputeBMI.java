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
        System.out.print("Введите вес в фунтах:");
        double weight = sc.nextDouble();
        System.out.print("Введите рост в дюймах:");
        double height = sc.nextDouble();
        sc.close();
        double BMI = Math.round(weight / (height * height)  * 703 * 10.0) / 10.0;
        System.out.println("Индекс массы вашего тела равен " + BMI);
    }
}
