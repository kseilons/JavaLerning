package regexp;

public class RegularExpressionExample {

	public static void main(String[] args) {
		if (getAnimal("cat")) {
			System.out.println("Valid");
		}	
		else {
			System.out.println("Not valid");
		}
	}

	private static boolean getAnimal(String str) {
		return str.matches("[Cc]at| [Dd]og");
	}
		
}