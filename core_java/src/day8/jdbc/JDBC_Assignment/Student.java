package day8.jdbc.JDBC_Assignment;

public class Student {
	private static int roll_number;
	private static String student_name;
	private String course;
	private int duration;
	private int age;	

	
	public Student() {
		
	}

		public Student(int rollnumber, String studentname, String courses, int durations, int age) {
		super();
		this.roll_number = rollnumber;
		this.student_name = studentname;
		this.course = courses;
		this.duration= durations;
		this.age = age;
		}
		
		public static int getRollnumber() {
		return roll_number;
		}
		
		public void setRollnumber(int rollnumber) {
		this.roll_number = rollnumber;
		}
		
		public static String getStudentname() {
		return student_name;
		}
		
		public void setStudentname(String studentname) {
		this.student_name = studentname;
		}
		
		public String getCourses() {
		return course;
		}
		
		public void setCourses(String courses) {
		this.course = courses;
		}
		
		public int getDurations() {
		return duration;
		}
		
		public void setDurations(int durations) {
		this.duration = durations;
		}
		
		public int getAge() {
		return age;
		}
		
		public void setAge(int age) {
		this.age = age;
		}
		
		@Override
		public String toString() {
		return "Student [rollnumber=" + roll_number + ", studentname=" + student_name + ", courses=" + course
			+ ", durations=" + duration + ", age=" + age + "]";
		}
		
		
			
			
		
		}
