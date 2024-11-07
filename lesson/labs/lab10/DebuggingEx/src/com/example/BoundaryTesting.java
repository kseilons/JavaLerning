
package com.example;

import java.util.Scanner;

public class BoundaryTesting {

    public static void main(String args[]) {
        int CALENDAR_START = 1583;
        Scanner sc = new Scanner(System.in);
        int year, month;
        for (int i = 0; i < 5; i++) {
            System.out.print("Year:");
            year = sc.nextInt();
            System.out.print("Month:");
            month = sc.nextInt();
            // validate input 
            if ((year < CALENDAR_START) || (month < 1) || (month > 12)) {
                System.out.println("Bad request: " + year + " " + month);
            } else {
                System.out.println("Good request:" + year + " " + month);
            }
        }

    }

}
