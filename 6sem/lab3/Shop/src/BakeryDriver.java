
public class BakeryDriver {
	public static void main(String[] args) {
		Cookie cookie = new Cookie("Chip", 1);
		
		System.out.println(cookie.getDepartment());
		System.out.println(cookie.getItemName());
		System.out.println(cookie.getType());
		System.out.println(cookie.getPrice());
		
		cookie.setPrice(12.23);
		System.out.println(cookie.getPrice());
		
		
	}

}
