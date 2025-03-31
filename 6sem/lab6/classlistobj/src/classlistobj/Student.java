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
		int comp = this.fName.compareTo(st2.getfName());
	    if (comp != 0) {
	        return comp;
	    }
	    comp = this.lName.compareTo(st2.getlName());
	    if (comp != 0) {
	        return comp;
	    }
	    comp = Double.compare(this.mark, st2.getMark());
	    if (comp != 0) {
	        return comp;
	    }
	    
		return comp;
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


	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (o == null || getClass() != o.getClass()) return false;

		Student student = (Student) o;
		return mark == student.mark && fName.equals(student.fName) && lName.equals(student.lName);
	}

	@Override
	public int hashCode() {
		int result = fName.hashCode();
		result = 31 * result + lName.hashCode();
		result = 31 * result + mark;
		return result;
	}
}
