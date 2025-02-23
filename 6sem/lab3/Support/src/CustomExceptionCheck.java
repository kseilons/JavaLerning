
public class CustomExceptionCheck {
	public static void main(String[] args) {
		
		try {
			throw new CustomException("unhandled error");
		}
		catch (CustomException e) {
			System.out.println(e.getMessage());
		}
	}

}
