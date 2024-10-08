/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example;

public class StringConcatenate1 {

    public static void main(String args[]) {
        String myString = "Hello";

        myString = myString + "!";
        System.out.println(myString);
        myString = myString.concat("8");
        System.out.println(myString);
    }
}
