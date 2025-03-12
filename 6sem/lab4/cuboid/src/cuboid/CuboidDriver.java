package cuboid;

public class CuboidDriver {

	public static void main(String[] args) {
		
		IntegerCuboid cuboid = new IntegerCuboid(5, 10, 15);

        System.out.println(cuboid.toString()); 
        System.out.println("Volume: " + cuboid.getVolume()); 
        System.out.println("Square: " + cuboid.getSquare());
	

        Cuboid<Double> cuboid1 = new Cuboid<>(2.235, 3.3, 4.7);

        Cuboid<Float> cuboid2 = new Cuboid<Float>(2.235f, 3.3f, 4.7f);
        System.out.println(cuboid2);
        System.out.println("Volume: " + cuboid1.getVolume());
	
	}
}
