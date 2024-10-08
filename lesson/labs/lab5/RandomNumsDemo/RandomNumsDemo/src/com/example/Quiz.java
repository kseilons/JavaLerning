/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author anshenoy
 */
public class Quiz {

    public static void main(String[] args) {
		// Subtraction Quiz
        Random rand = new Random();
        // Generate two numbers for our quiz
        int num1 = rand.nextInt(10);
        int num2 = rand.nextInt(10);
        // ensure that num1 is less than num2
        if (num1 > num2) {
            // swap the numbers so the lower number
            // is stored in num1
            int temp = num1;
            num1 = num2;
            num2 = temp;
        }

        // present the question to the user
        System.out.print("What is " + num2 + " - " + num1 + "? ");

        // create a scanner
        Scanner numberScanner = new Scanner(System.in);

        // get an answer from the user
        int userAnswer = numberScanner.nextInt();

        // see if they won
        if (userAnswer == (num2 - num1)) {
            System.out.println("That's correct!");
        } else {
            System.out.println("Sorry, the correct answer is " + (num2 - num1));
        }

        numberScanner.close();

    }

}
