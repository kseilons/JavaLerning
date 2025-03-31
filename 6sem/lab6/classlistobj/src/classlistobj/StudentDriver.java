package classlistobj;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class StudentDriver {

	public static void main(String[] args) {
		List<Student> st = new ArrayList<>();
		
		
		addStudents(st);
		displayStudents(st);
		Sort.mergeSort(st, 0, st.size() - 1);
		Collections.sort(st);
		
		
		System.out.println("\n\n");
		displayStudents(st);
		
	}
	

	
	
	private static void addStudents(List<Student> st) {

		st.add(new Student("Andrew", "Apic", 45));
		
		st.add(new Student("Mark", "Mywords", 94));
		st.add(new Student("Mark", "Mywords", 95));
		st.add(new Student("Andrew", "Apic", 45));
		st.add(new Student("Beth", "Tween", 78));
		st.add(new Student("Beth", "Aween", 78));
		st.add(new Student("Beth", "Aween", 78));
		
	}
	
	
	private static void displayStudents(List<Student> st) {
		for (Student st1: st) {
			System.out.println(st1);
		}
	}
	
	
}
