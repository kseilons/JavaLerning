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
public class AgeLimit {
   public static void main(String args[]) {
        int age=0;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter age ");
        age = sc.nextInt();
      //age=Math.max(age,0);
      age=Math.min(40, age);
       System.out.print("Age is "+age);
    } 
}
