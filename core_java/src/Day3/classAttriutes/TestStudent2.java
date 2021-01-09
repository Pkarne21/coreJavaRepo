package Day3.classAttriutes;
import Day3.bean.*;
public class TestStudent2 {
	public static void main(String[] args) {
		 Student s1= new Student(1,"Lisa","BE");
		 Student s2= new Student(2,"John","SE");
		 Student s3= new Student(3,"David","FE");
		 Student s4= new Student(4,"Patrick","TE");
		// System.out.println(s1 +"\n" + s2+"\n"+s3+"\n"+s4 );
		 Student[] arrayOfStudents={s1,s2,s3,s4};
		 TestStudent2 testStudent2 = new TestStudent2();
		 testStudent2.displayAllStudents(arrayOfStudents);
	}
	public void displayAllStudents(Student[] arrayOfStudents)
	
	{
		for(Student student:arrayOfStudents)
		{
			System.out.println(student);
		}
}
}
