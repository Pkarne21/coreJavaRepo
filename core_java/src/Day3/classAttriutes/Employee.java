package Day3.classAttriutes;

public class Employee {
	private int empId;
	private String empame;
	public Employee()
	{
		
	}
	
	public Employee(int empId, String empame) {
		super();
		this.empId = empId;
		this.empame = empame;
	}

	public int getEmpId() {
		return empId;
	}
	public void setEmpId(int empId) {
		this.empId = empId;
	}
	public String getEmpame() {
		return empame;
	}
	public void setEmpame(String empame) {
		this.empame = empame;
	}

	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", empame=" + empame + "]";
	}
	
	


}
