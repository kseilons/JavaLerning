/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example;

import java.util.Scanner;

public class NameMaker {
    
    public static void main(String args[])
    {
        
        String firstName, middleName, lastName, fullName;

        Scanner input = new Scanner(System.in);

        System.out.println("Enter name");
        firstName = input.nextLine();
        System.out.println("Enter middle name");
        middleName = input.nextLine();
        System.out.println("Enter last name");
        lastName = input.nextLine();

        fullName = firstName + ' ' + middleName + ' ' + lastName;
        System.out.println(fullName);

        input.close();

    }
}
