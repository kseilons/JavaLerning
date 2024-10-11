/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example;

import java.time.format.TextStyle;
import java.util.Calendar;
import java.time.Month;

import java.util.Locale;
import java.util.Scanner;
/**
 *
 * @author anshenoy
 */
public class SwitchEx1 {

    public static void main(String args[]) {
        System.out.println("Введите номер месяца: ");
        Scanner sc = new Scanner(System.in);
//        С использование Month класса
//        Month month = Month.of(sc.nextInt());
//        sc.close();
//        String monthName = month.getDisplayName(TextStyle.FULL, Locale.forLanguageTag("ru"));
//        System.out.println(monthName);

        int monthNumber = sc.nextInt();
        sc.close();

        String[] monthNamesNominative = {
                "январь", "февраль", "март", "апрель", "май", "июнь",
                "июль", "август", "сентябрь", "октябрь", "ноябрь", "декабрь"
        };

        if (monthNumber < 1 || monthNumber > 12) {
            System.out.println("Некорректный номер месяца");
        } else {
            System.out.println(monthNamesNominative[monthNumber - 1]);
        }
    }
}
