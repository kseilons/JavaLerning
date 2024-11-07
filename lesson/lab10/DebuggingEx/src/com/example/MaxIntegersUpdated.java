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
public class MaxIntegersUpdated {

    public static void main(String[] args) {
        int num1 = 3, num2 = 3, num3 = 3;
        int max = 0;

        if (num1 > max) {
          max = num1;   
        }
       
        if (num2 > max) {
          max = num2;  
        }
        
        if (num3 > max) {
         max = num3;   
        }
        

        System.out.println(" The max of 3 numbers is " + max);
    }

}
