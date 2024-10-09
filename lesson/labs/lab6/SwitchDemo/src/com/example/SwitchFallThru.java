/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example;

import java.util.Scanner;

public class SwitchFallThru {

    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a month number");

        int month = in.nextInt();
        switch (month) {
            case 2:
                System.out.println("28 days (29 in leap years)");
                break;
            case 4:
            case 6:
            case 9:
            case 12:
                System.out.println("30 days");
                break;
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 11:
                System.out.println("31 days");
                break;
            default:
                System.out.println("Illegal month number");
                break;

        }
    }
}
