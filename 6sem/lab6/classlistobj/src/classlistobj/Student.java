package classlistobj;

public class Student implements Comparable<Student>{

	
	private String fName;
	private String lName;
	private int mark;
	
	public Student(String fName, String lName, int mark) {
		this.fName = fName;
		this.lName = lName;
		this.mark = mark;
	}


	@Override
	public int compareTo(Student st2) {

		if (this.mark > st2.getMark()) return 1;
		else if (this.mark == st2.getMark()) return 0;
		return -1;
	}
	
	public String getfName() {
		return fName;
	}

	public void setfName(String fName) {
		this.fName = fName;
	}

	public String getlName() {
		return lName;
	}

	public void setlName(String lName) {
		this.lName = lName;
	}

	public int getMark() {
		return mark;
	}

	public void setMark(int mark) {
		this.mark = mark;
	}

	@Override
	public String toString() {
		return "Student details: " + fName + ", " + lName + ", " + mark;
	}
	
	
}
