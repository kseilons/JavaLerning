package bikeproject;

public class RoadBike extends Bike implements RoadParts{
	
	private int tyreWidth, postHeight;
	
	public RoadBike()
	{
		this("drop", "racing", "tread less", "razor", 19, 20, 22);
	}//end constructor
	
	public RoadBike(int postHeight)
	{
		this("drop", "racing", "tread less", "razor", 19, 20, postHeight);
	}//end constructor
		
	public RoadBike(String handleBars, String frame, String tyres, String seatType, int numGears,
			int tyreWidth, int postHeight) {
		super(handleBars, frame, tyres, seatType, numGears);
		this.tyreWidth = tyreWidth;
		this.postHeight = postHeight;
	}//end constructor
	
	public void printDescription()
	{
		System.out.println(this);
	}//end method printDescription
	
	@Override
	public String toString() {
		return super.toString() + "This Roadbike bike has " + this.tyreWidth + 
				"mm tyres and a post height of " + this.postHeight + 
				". \nThis bike is best for " + this.terrain;
	}
	
	@Override
	public int getTyreWidth() {
		return tyreWidth;
	}
	@Override
	public int getPostHeight() {
		return postHeight;
	}
	
	@Override
	public void setTyreWidth(int tyre) { 
		this.tyreWidth = tyre;
	}
	
	@Override
	public void setPostHeight(int post) {
		postHeight = post;
	}
}//end class RoadBike
