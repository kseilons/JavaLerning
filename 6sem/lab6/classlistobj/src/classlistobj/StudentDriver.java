package classlistobj;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class StudentDriver {

	public static void main(String[] args) {
		List<Student> st = new ArrayList<>();
		
		
		addStudents(st);
		displayStudents(st);
		Collections.sort(st);
		
		System.out.println("\n\n");
		displayStudents(st);
		
	}
	
	
	private static void addStudents(List<Student> st) {
		st.add(new Student("Mark", "Mywords", 95));
		st.add(new Student("Andrew", "Apic", 45));
		st.add(new Student("Beth", "Tween", 78));
		
	}
	
	
	private static void displayStudents(List<Student> st) {
		for (Student st1: st) {
			System.out.println(st1);
		}
	}
	
	
}
