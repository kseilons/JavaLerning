package bikeproject;

public class BikeDriver {

	public static void main(String[] args) {
		RoadBike bike1 = new RoadBike();
		RoadBike bike2 = new RoadBike("drop", "tourer", "semi-grip", "comfort", 14, 25, 18);		
		MountainBike bike3 = new MountainBike();
		
		
		bike1.printDescription();
		bike2.printDescription();
		bike3.printDescription();
		bike1.setPostHeight(20);
		bike1.printDescription();
	}//end method main

}//end class BikeDriver
