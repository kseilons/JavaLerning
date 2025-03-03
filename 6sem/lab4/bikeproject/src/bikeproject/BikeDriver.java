package bikeproject;

public class BikeDriver {

	public static void main(String[] args) {
		
		RoadBike bike1 = new RoadBike();
		RoadBike bike2 = new RoadBike("drop", "tourer", "semi-grip", "comfort", 14, 25, 18);		
		MountainBike bike3 = new MountainBike();
		

	    bike2.setPostHeight(20);
		System.out.print(bike1 + "\n");
		System.out.print(bike2 + "\n");
		System.out.print(bike3 + "\n");
	}//end method main

}//end class BikeDriver
