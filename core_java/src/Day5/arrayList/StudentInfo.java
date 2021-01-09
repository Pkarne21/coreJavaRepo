package Day5.arrayList;

import java.util.ArrayList;
import java.util.Iterator;



public class StudentInfo {
	public static void main(String[] args) {
		Student s1=new Student(1,"A");
		Student s2=new Student(2,"B");
		Student s3=new Student(3,"C");
		Student s4=new Student(4,"D");
		ArrayList<Student> studentList=new ArrayList<Student>();
		studentList.add(s1);
		studentList.add(s2);
		studentList.add(s3);
		studentList.add(s4);
		Iterator<Student> itr=studentList.iterator();
	      System.out.println("\nThe iterator values"
          + " of list are: "); 
    while (itr.hasNext()) { 
  	  Student x=itr.next();
		System.out.println(x);
    //System.out.print(itr.next() + " "); 
} 
		
		
		
	}

}
