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
public class IfSolution {

    public static void main(String args[]) {

        Scanner in = new Scanner(System.in);
        System.out.println("What grade are you in?");
        int grade = in.nextInt();
        if (grade == 9) {
            System.out.println("You are a freshman");
        } else if (grade == 10) {
            System.out.println("You are a sophomore");
        } else if (grade == 11) {
            System.out.println("You are a junior");
        } else if (grade == 12) {
            System.out.println("You are a senior");
        } else {
            System.out.println("Invalid grade");
        }
    }

}
