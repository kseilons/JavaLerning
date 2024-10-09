/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package conditionalex;

import java.util.Scanner;

/**
 *
 * @author anshenoy
 */
public class WatchMovie {

    public static void main(String args[]) {
        System.out.print("Enter the movie ticket price \n");
        Scanner sc = new Scanner(System.in);
        int price = sc.nextInt();
        System.out.print("Enter the movie rating(as integer) \n");
        int rating = sc.nextInt();
        if (price >= 12 && rating == 5) {
            System.out.println("Мне интересно посмотреть фильм");
        } else {
            System.out.println("Я не заинтересован в просмотре фильма");
        }
    }
}
