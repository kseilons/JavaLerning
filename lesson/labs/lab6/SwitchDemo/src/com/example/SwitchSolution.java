/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example;

import java.util.Scanner;

/**
 *
 * @author anshenoy
 */
public class SwitchSolution {

    int month;

    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        System.out.println("What grade are you in?");
        int grade = in.nextInt();
        switch (grade) {
            case 9:
                System.out.println("You are a freshman");
                break;
            case 10:
                System.out.println("You are a sophomore");
                break;
            case 11:
                System.out.println("You are a junior");
                break;
            case 12:
                System.out.println("You are a senior");
                break;
            default:
                System.out.println("Invalid grade");
        }
    }
}
