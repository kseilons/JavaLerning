
public class Cookie implements Item{

	private String cookieType;
	private double price;
	
	
	public Cookie(String type, double price) {
		cookieType = type;
		this.price = price;
	}
	
	@Override
	public String getItemName() {
		return "Cookie";
	}
	
	@Override
	public double getPrice() {
		return price;
	}
	
	@Override
	public void setPrice(double price) {
		this.price = price;
	}
	
	@Override
	public String getDepartment() {
		return "Bakery";
	}
	
	public String getType() {
		return cookieType;
	}
}
