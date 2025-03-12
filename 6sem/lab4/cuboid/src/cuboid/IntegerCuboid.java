package cuboid;

public class IntegerCuboid extends Cuboid<Integer> {

    public IntegerCuboid(Integer width, Integer length, Integer height) {
        super(width, length, height); 
        
    }
    
    public double getSquare() {
        return 2 * (width.doubleValue() * length.doubleValue() +
                    width.doubleValue() * height.doubleValue() +
                    length.doubleValue() * height.doubleValue());
    }

}