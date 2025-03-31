package stringExample;

public class StringSplit {
	public static void main(String[] args) {
		String sentence = "This is my sentence";
		String[] tokens = sentence.split("[ie]");
		
		for (String str: tokens) {
			System.out.println(str);
		}
	}
}


