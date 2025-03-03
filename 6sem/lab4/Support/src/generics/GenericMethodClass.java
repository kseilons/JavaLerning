package generics;

import java.util.ArrayList;
import java.util.List;

public class GenericMethodClass {

	public <T> void printArray(T[] array) {
		for (T arr: array) {
			System.out.println(arr);
		}
	}
	
	public void printList(List<?> list) {
		for (Object el: list) {
			System.out.println(el);
		}
		
		System.out.println();
	}
	
	public double sumOfList(ArrayList<? extends Number> ar) {
		
		double s = 0;
		for (Number n: ar) {
			s += n.doubleValue();
		}
		
		return s;
		
	}
	
	
	public void addNumbers(ArrayList<? super Integer> ar) {
		for (int i = 0; i < 10; i++) {
			ar.add(i);
		}
	}
}
