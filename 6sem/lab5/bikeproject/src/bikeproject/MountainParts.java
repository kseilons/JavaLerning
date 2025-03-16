package bikeproject;

public interface MountainParts {

	//final String TERRAIN = "off_road";
	
	public final BikeUses terrain = BikeUses.off_road;
	
	String getSuspension();
	String getType();
	
	
	void setSuspension(String sus);
	void setType(String type);
}
