package Day3.classAttriutes;

public class TestEmployee {
	public static void main(String[] args) {
		Employee e1=new Employee();
		System.out.println(e1.getEmpame());
		System.out.println(e1.getEmpId());
		System.err.println("Updating value");
		e1.setEmpId(6001);
		e1.setEmpame("john");
		System.out.println(e1.getEmpame());
		System.out.println(e1.getEmpId());
		Employee e2=new Employee(1,"David");
	    System.out.println(e2.getEmpame());
		System.out.println(e2.getEmpId());
		System.out.println(e2);
		
	    
		
		
		
	}

}
