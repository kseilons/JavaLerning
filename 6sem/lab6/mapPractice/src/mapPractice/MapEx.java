package mapPractice;

import java.util.HashMap;
import java.util.Map;

public class MapEx {

	public static void main(String[] args) {
		Map<String, String> courses = new HashMap<>();
		
		courses.put("CIT", "Computing and Information Technology");
		courses.put("CHI", "Childcare and Early Education");
		courses.put("MVS", "Motor Vehicle Systems");
		courses.put("BTH", "Beauty Therapy");
		courses.put("GDE", "Graphic Design");
		
		
		for (String str: courses.values()) {
			System.out.println(str);
		}
		
		System.out.println(courses.get("CIT"));
		
	}
}
