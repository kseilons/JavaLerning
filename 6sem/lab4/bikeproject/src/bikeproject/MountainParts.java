package bikeproject;

public interface MountainParts {
	public final BikeUses terrain = BikeUses.off_road;
    
    String getSuspension();
    void setSuspension(String newValue);
    String getType();
    void setType(String newValue);
}
