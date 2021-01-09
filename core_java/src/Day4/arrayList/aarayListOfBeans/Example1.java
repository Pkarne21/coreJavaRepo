package Day4.arrayList.aarayListOfBeans;

import java.util.ArrayList;

import Day3.classAttriutes.Employee;

public class Example1 {
	public static void main(String[] args) {
		Employee employee1=new Employee(1001,"Derek");
		Employee employee2=new Employee(1002,"John");
		Employee employee3=new Employee(1003,"Peter");
		Employee employee4=new Employee(1004,"Lisa");
		ArrayList<Employee> employeeList= new ArrayList<Employee>();
		employeeList.add(employee1);
		employeeList.add(employee2);
		employeeList.add(employee3);
		employeeList.add(employee4);
		for(Employee employee:employeeList)
		{
			System.out.println(employee);
		}
	}
}
