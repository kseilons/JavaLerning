package presentation;

public class RecursionExample {
	public static void main(String[] args) {
		recurseMethod(4);
		System.out.println("Результат " + factorial(5));
	}
	
	static void recurseMethod(int num){
		if(num == 0)
			return;
		else{
			System.out.println("hello " + num);
			recurseMethod(--num);
			System.out.println(""+num);
			return;
		}
	}
	
	public static double factorial(double d) {
		if (d <= 1) {
			return 1;
		}
		else {
			return d * factorial(d - 1);
		}
	}
}
