package Day5.setExamples;
import java.util.*;

import Day3.classAttriutes.Employee;

public class Example5 {
	public static void main(String[] args) {
		Employee e1=new Employee(1,"John");
		Employee e2=new Employee(2,"David");
		Employee e3=new Employee(1,"Lisa");
		Employee e4=new Employee(1,"Carol");
		Set<Employee> setOfEmployees = new HashSet<Employee>();
		setOfEmployees.add(e1);
		setOfEmployees.add(e2);
		setOfEmployees.add(e3);
		setOfEmployees.add(e4);
		for(Employee employee:setOfEmployees) {
		System.out.println(employee);
		
		
	}
	
	
	}
	

}
