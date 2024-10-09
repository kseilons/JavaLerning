/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package conditionalex;

import java.util.Scanner;

/**
 *
 * @author anshenoy
 */
public class ComputeFare {

    public static void main(String args[]) {
        System.out.print("Enter the age \n");
        Scanner keyboard = new Scanner(System.in);
        int age = keyboard.nextInt();
        keyboard.close();
        int fare;
        if (age < 11) {
            fare = 3;
        } else if (age < 65) {
            fare = 5;
        } else {
            fare = 3;
        }
        System.out.println("Тариф " + fare + "$");

    }
}
