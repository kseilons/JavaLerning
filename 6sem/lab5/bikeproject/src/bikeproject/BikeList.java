package bikeproject;

import java.util.ArrayList;
import java.util.Random;

// Driver class
public class BikeList {
    public static void main(String[] args) {
        ArrayList<Bike> bikes = new ArrayList<>();
        int mountainBikeSales = 0;
        int roadBikeSales = 0;

        fillArray(bikes);
        displayStock(bikes);
        displayBikeNumbers(bikes);
    }

    public static void fillArray(ArrayList<Bike> bikes) {
        Random rand = new Random();
        for (int i = 0; i < 10; i++) {
            if (rand.nextDouble() < 0.5) { // Randomly decide whether to add a Mountain or Road bike
                bikes.add(new MountainBike("Bull Horn", "Hardtail", "Maxxis", "dropper", 21, "RockShox XC32", "Pro", 19));
            } else {
                bikes.add(new RoadBike("drop", "racing", "tread less", "razor", 19, 20, 22));
            }
        }
    }

    public static void displayStock(ArrayList<Bike> bikes) {
        System.out.println("Stock List:");
        for (Bike bike : bikes) {
            bike.printDescription();
        }
    }

    public static int calculateStock(ArrayList<Bike> bikes) {
        int bikesSold = 0;
        for (Bike bike : bikes) {
            if (bike instanceof MountainBike) {
                bikesSold++;
            }
        }
        return bikesSold;
    }

    public static void displayBikeNumbers(ArrayList<Bike> bikes) {
        int mb = calculateStock(bikes);
        int rb = bikes.size() - mb;

        System.out.println("\nStock Levels:");
        System.out.println("We have " + mb + " Mountain Bikes in stock");
        System.out.println("We have " + rb + " Road Bikes in stock");
    }
}


