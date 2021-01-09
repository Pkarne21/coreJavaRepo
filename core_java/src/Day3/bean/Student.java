package Day3.bean;

public class Student {
	private int rollNumber;
	private String studentName;
	private String courses;
	public Student()
	{
		
	}
	public Student(int rollNumber, String studentName, String courses) {
		super();
		this.rollNumber = rollNumber;
		this.studentName = studentName;
		this.courses = courses;
	}
	public int getRollNumber() {
		return rollNumber;
	}
	public void setRollNumber(int rollNumber) {
		this.rollNumber = rollNumber;
	}
	public String getStudentName() {
		return studentName;
	}
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
	public String getCourses() {
		return courses;
	}
	public void setCourses(String courses) {
		this.courses = courses;
	}
	@Override
	public String toString() {
		return "Student [rollNumber=" + rollNumber + ", studentName=" + studentName + ", courses=" + courses + "]";
	}
	
	
	

}
