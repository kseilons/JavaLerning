package cuboid;

public class Cuboid<T extends Number>{

	T width;
	T length;
	T height;
	
	
	public Cuboid (T first, T second, T third){
		width = first;
		length = second;
		height = third;
	}
	
	
	@Override
	public String toString() {
		return "Width: " + width + ". Length: " + length + ". Height: " + height;
	}
	
	
	public double getVolume() {
		return width.doubleValue() * length.doubleValue() * height.doubleValue();
	}
	
}
