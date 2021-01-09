package Day5.setExamples;
import java.util.*;

import Day3.classAttriutes.Employee;

public class Example6 {
	public static void main(String[] args) {
		Employee employee1 = new Employee(1001, "Derek");
		Employee employee2 = new Employee(1002, "John");
		Employee employee3 = new Employee(1003, "Peter");
		Employee employee4 = new Employee(1004, "Lisa");
		Set<Employee> setOfEmployees = new HashSet<Employee>();
		setOfEmployees.add(employee1);
		setOfEmployees.add(employee2);
		setOfEmployees.add(employee3);
		setOfEmployees.add(employee4);
		Iterator<Employee> iter = setOfEmployees.iterator();
		while(iter.hasNext()) {
		Employee employee = iter.next();
		System.out.println(employee);
		}
		}
	
	
	
	
	

}
