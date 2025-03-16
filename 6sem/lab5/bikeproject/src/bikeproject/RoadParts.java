package bikeproject;

public interface RoadParts {

//	final String TERRAIN = "track_racing";

	public final BikeUses terrain = BikeUses.track;

	int getTyreWidth();
	int getPostHeight();
	
	void setTyreWidth(int tyre);
	void setPostHeight(int post);	
}
