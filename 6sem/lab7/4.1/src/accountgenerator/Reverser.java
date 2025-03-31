package accountgenerator;

public class Reverser {

	
	public static void main(String[] args) {
		String str = "first";
		String help = reverse(str);
		
		System.out.println(str.equals(reverse(help)));
	}
		
	public static String reverse(String str){
		String strRev = "";
		for(int i=str.length() - 1; i >= 0; i--)
		 strRev+=str.charAt(i);
		 //endfor
		return strRev;
	}//end method reverse
}
