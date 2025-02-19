
public class Cookie implements Item {
	public String cookieType;
	private double price;
	
	public Cookie(String type, double price) {
		cookieType = type;
		this.price = price;
	}
	
	public String getItemName() {
		return "Cookie";

	}
	
	public double getPrice() {return price;}
	
	public void setPrice(double price) {this.price = price;}
	
	public String getDepartment() {
		return "Bakery";
	}
	
	public String getType() {
		return cookieType;
	}
	
	
	
}
