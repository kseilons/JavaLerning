/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example;

import java.util.Random;

public class RandomNumSeed {
    public static void main(String[] args) {
        Random num = new Random(20);
        int randomNum = num.nextInt(30);
        System.out.println("Random Number: " + randomNum);
        num.setSeed(50);
        int randomNum2 = num.nextInt(30);
        System.out.println("Random Number: " + randomNum2);
        num.setSeed(20);
        int randomNum3 = num.nextInt(30);
        System.out.println("Random Number: " + randomNum3);
    }
}
