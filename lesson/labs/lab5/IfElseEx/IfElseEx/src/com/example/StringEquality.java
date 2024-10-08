/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example;

/**
 *
 * @author anshenoy
 */

import java.util.Scanner;
public class StringEquality {
    public static void main(String[] args) {
        System.out.print("Enter your name: ");
        Scanner sc = new Scanner(System.in);
        String name = sc.next();
        sc.close();

        if (name.equals("My")) {
            System.out.println("You're the kind of rock and roll");
        }
        else {
            System.out.println("You're not the kind");
        }
    }
}

