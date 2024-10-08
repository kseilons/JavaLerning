/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example;

import java.util.Random;

public class RandomNumRange {

    public static void main(String[] args) {

        Random num = new Random();
        int randomnum = num.nextInt(10)+4;
        System.out.println("Random Number: " + randomnum);

    }

}
