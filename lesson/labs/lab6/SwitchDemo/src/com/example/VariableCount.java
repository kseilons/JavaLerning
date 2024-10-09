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
public class VariableCount {

    public static void main(String args[]) {
        char option = 'A';
        int aCount = 0, bCount = 0, cCount = 0;
        switch (option) {
            case 'A':
                aCount++;
                System.out.println("Count of A  " + aCount);
                break;
            case 'B':
                bCount++;
                System.out.println("Count of B  " + bCount);
                break;
            case 'C':
                cCount++;
                System.out.println("Count of B  " + cCount);
                break;
        }

    }
}
