package ex;

public class Ex2 {

	public static void main(String[] args) {
		System.out.println(reverse("hello world"));
	}
	
	public static String reverse(String str) {
	    String strRev = "";
	    for (int i = str.length() - 1; i >= 0; i--) { 	//проход по строке с конца
	        strRev += str.charAt(i); 	//добавляем символ к новой строке
	    }
	    return strRev;
	}
}
