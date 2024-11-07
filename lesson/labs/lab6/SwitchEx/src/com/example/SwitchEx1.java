/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example;

import java.time.format.TextStyle;
import java.util.Calendar;
import java.time.Month;

import java.util.InputMismatchException;
import java.util.Locale;
import java.util.Scanner;
/**
 *
 * @author anshenoy
 */
public class SwitchEx1 {
    private static final int[] monthDay = {
            31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31
    };
    private static final String[] monthNamesNominative = {
        "январь", "февраль", "март", "апрель", "май", "июнь",
                "июль", "август", "сентябрь", "октябрь", "ноябрь", "декабрь"
    };
    de

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int monthNumber = getValidMonthNumber(sc, "Введите номер месяца с которого начинать отчет(включительно): ");
        System.out.println(monthNamesNominative[monthNumber - 1]);


        int monthAfter = getValidPositiveInt(sc, "Введите кол-во месяцев после: ");
        sc.close();

        int sumDay = calculateTotalDays(monthNumber, monthAfter);

        System.out.println("Всего дней: " + sumDay);
    }

    private static int calculateTotalDays(int monthNumber, int monthAfter) {
        int sumDay = 0;
        for (int i = 0; i < monthAfter; i++) {
            int indexCurrentMonth = (monthNumber - 1 + i) % 12;
            sumDay += monthDay[indexCurrentMonth];
        }
        return sumDay;
    }

    private static int getValidMonthNumber(Scanner sc, String prompt) {
        int monthNumber;
        while (true) {
            System.out.println(prompt);
            try {
                monthNumber = sc.nextInt();
                if (monthNumber >= 1 && monthNumber <= 12) {
                    return monthNumber;
                }
                System.out.println("Некорректный номер месяца");
            } catch (InputMismatchException e) {
                System.out.println("Пожалуйста, введите число.");
                sc.next();
            }

        }
    }

    private static int getValidPositiveInt(Scanner sc, String prompt) {
        int result;
        while (true) {
            System.out.println(prompt);
            try {
                result = sc.nextInt();
                if (result >= 0) {
                    return result;
                }
                System.out.println("Некорректное значение");
            } catch (InputMismatchException e) {
                System.out.println("Пожалуйста, введите положительное число.");
                sc.next();
            }

        }
    }
}


//        С использование Month класса
//        Month month = Month.of(sc.nextInt());
//        sc.close();
//        String monthName = month.getDisplayName(TextStyle.FULL, Locale.forLanguageTag("ru"));
//        System.out.println(monthName);

