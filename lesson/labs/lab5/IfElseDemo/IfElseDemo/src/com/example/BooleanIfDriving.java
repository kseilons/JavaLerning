/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example;


public class BooleanIfDriving {
    public static void main(String args[]) {
        String left = "museum";
        String straight = "gym";
        String right = "restaurant";

        if (left.equals("gym")) {
            System.out.print("Turn Left");
        }
        if (straight.equals("gym")) {
            System.out.print("Drive straight");
        }
        if (right.equals("gym")) {
            System.out.print("Turn Right");
        }
    }
}
