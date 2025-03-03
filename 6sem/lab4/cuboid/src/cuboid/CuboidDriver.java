package cuboid;

public class CuboidDriver {

	public static void main(String[] args) {

        Cuboid<Integer> cuboid = new Cuboid<>(2, 3, 4);
        System.out.println(cuboid);
        System.out.println("Volume: " + cuboid.getVolume());
        Cuboid<Double> cuboid1 = new Cuboid<>(2.235, 3.3, 4.7);
        System.out.println(cuboid1);
        System.out.println("Volume: " + cuboid1.getVolume());
	
	}
}
