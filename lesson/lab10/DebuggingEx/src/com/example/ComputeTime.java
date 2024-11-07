
package com.example;

public class ComputeTime {

    public static void main(String[] args) {

        double x1 = 20;
        double x2 = 30;
        double y1 = 10;
        double y2 = 10;
        double speed = 0.3;
        double distance = getDistance(x1, x2, y1, y2);
        double time = distance / speed;
        System.out.println("Time taken to reach the gas station is " + time);

    }

    static double getDistance(double x1, double x2, double y1, double y2) {
        return Math.sqrt((x1 - x2) * (x1 - x2) + (y1 - y2) * (y1 - y2));
    }

}


