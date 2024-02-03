package groupc.hw2.student;

public class Student {
	//The values of each student (id,name,grade)
	private int id;
	private String name;
	private double grade;
	
	//Default constructor
	public Student() { 
	}

	//parameterized Constructor 
	public Student(int id, String name, double grade) {
		this.id = id;
		this.name = name;
		this.grade = grade;
		
	}

	///////////////////////////////////////////////////////////////////////////////
	//The following lines are the getters and setters for the ID, name, and grade//
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getGrade() {
		return grade;
	}

	public void setGrade(double grade) {
		this.grade = grade;
	}
	///////////////////////////////////////////////////////////////////////////////

	//ToString method that will display the student information
	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", grade=" + grade + "]";
	}
	
	
	
}
