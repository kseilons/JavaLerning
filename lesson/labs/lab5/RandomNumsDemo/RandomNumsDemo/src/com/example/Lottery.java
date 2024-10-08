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
public class Lottery {
    

	public static void main(String[] args)
	{
		// Lottery Part 1

		// create a scanner
		Scanner numberScanner = new Scanner(System.in);

		// get an integer from the user
		System.out.print("Give me a number between 1 and 10: ");
		int userNumber = numberScanner.nextInt();

		// generate a winning number
                Random rnd=new Random();
		int winningNumber = rnd.nextInt(10)  + 1;

		// announce winning number
		
                System.out.println("Your Number: "+userNumber);
                System.out.println("The winning number is: " + winningNumber);

		

	}

}
    

