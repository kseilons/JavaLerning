/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;

public class RockPaperScissor {
    
    public static void main(String[] args) {
        Map<Integer, String> choices = new HashMap<>();
        choices.put(0, "камень");
        choices.put(1, "бумага");
        choices.put(2, "ножницы");

        Random rand = new Random();
        int num = rand.nextInt(3);

        System.out.println(choices.get(num));
    
    }
}
