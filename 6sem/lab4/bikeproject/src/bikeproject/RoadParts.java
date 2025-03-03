package bikeproject;

public interface RoadParts {
	public final BikeUses terrain = BikeUses.track;
    
    int getTyreWidth();
    void setTyreWidth(int newValue);
    int getPostHeight();
    void setPostHeight(int newValue);
}
