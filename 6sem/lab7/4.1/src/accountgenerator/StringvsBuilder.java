package accountgenerator;

public class StringvsBuilder {
	public static void main(String[] args) {
		String str1 = "Hello";
		StringBuilder str2 = new StringBuilder("Hello");
		System.out.println(str1 + " " + str1.hashCode());
		System.out.println(str2.toString() + " " + str2.hashCode());
		str1 = str1+ "World";
		str2.append("World");
		System.out.println(str1 + " " + str1.hashCode());
		System.out.println(str2.toString() + " " + str2.hashCode());
		
		String reverst = reverse(str2.toString());
		System.out.println(reverst + " " + reverst.hashCode());
	}//end method main;
	
	
	
	public static String reverse(String str){
		StringBuilder sb = new StringBuilder(str);
		return sb.reverse().toString();
	}//end method reverse
}//end class StringvsBuilder