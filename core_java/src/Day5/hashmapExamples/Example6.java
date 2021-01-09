package Day5.hashmapExamples;
import java.util.*;


//import Day3.classAttriutes.Employee;
import Day5.arrayList.Student;

public class Example6 {
	public static void main(String[] args) {
		EmployeeBean e1=new EmployeeBean(1,"A");
		EmployeeBean e2=new EmployeeBean(2,"B");
		EmployeeBean e3=new EmployeeBean(3,"C");
		EmployeeBean e4=new EmployeeBean(4,"D");
		
		Map<Integer,EmployeeBean> employeeInfo =new HashMap<Integer,EmployeeBean>();
		 employeeInfo.put(1001,e1);
		 employeeInfo.put(1002,e2);
		 employeeInfo.put(1003,e3);
		 employeeInfo.put(4,e4);
		// System.out.println("\n"+employeeInfo);
		Set<Integer>keyOfSet=employeeInfo.keySet();
		for(int x:keyOfSet)		
		{
			EmployeeBean emp=employeeInfo.get(x);
			System.out.println(emp);
		}
		Iterator<Integer> itr=keyOfSet.iterator();
	      System.out.println("\nThe iterator values"+ " of list are: "); 
	      while (itr.hasNext())
	      { 
	    	 Integer x=itr.next();
	    	  System.out.println(x);
	    	  
} 
		
		
		 
		

		 
}

}
