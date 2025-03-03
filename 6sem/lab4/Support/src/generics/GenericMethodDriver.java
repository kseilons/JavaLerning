package generics;

import java.util.ArrayList;
import java.util.List;

public class GenericMethodDriver {

	public static void main(String[] args) {
		Integer[] intAr = {1, 2, 3};
		
		String[] strArr = {"This", "is", "fun"};
		
		GenericMethodClass cl = new GenericMethodClass();
		
		cl.printArray(intAr);	
		cl.printArray(strArr);
	
		ArrayList<Double> ar1 = new ArrayList<>();
		ar1.add(12.34);
		ar1.add(34.23);
		ar1.add(43.3);
		
		cl.printList(ar1);
		
		ArrayList<Integer> ar2 = new ArrayList<>();
		ar2.add(12);
		ar2.add(34);
		ar2.add(43);
		
		cl.printList(ar2);
		
		System.out.println(cl.sumOfList(ar1));
		System.out.println((int) cl.sumOfList(ar1));
		
		ArrayList<Integer> list = new ArrayList<Integer>();
		cl.addNumbers(list);
		cl.printList(list);
		
	}
	
	
	
}
