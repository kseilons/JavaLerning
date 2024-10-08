/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example;

import java.util.Random;

public class RandomDouble {

    public static void main(String[] args) {

        Random num = new Random();
        double randomDouble = num.nextDouble();
        System.out.println("Random Number: " + randomDouble);

    }

}


