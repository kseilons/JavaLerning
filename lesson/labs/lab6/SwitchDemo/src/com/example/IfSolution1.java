/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example;

import java.util.Scanner;

public class IfSolution1 {

    public static void main(String args[]) {

        int month;
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the month");
        month = in.nextInt();

        if (month == 1 || month == 3 || month == 5 || month == 7
                || month == 8 || month == 10 || month == 12) 
        {
            System.out.println("31 days in the month.");
        } else if (month == 2) {
            System.out.println("28 days in the month.");
        } else if (month == 4 || month == 6 || month == 9 || month == 11) {
            System.out.println("30 days in the month.");
        } else {
            System.out.println("Invalid month.");
        }
    }
}
