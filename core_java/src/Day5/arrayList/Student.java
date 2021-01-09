package Day5.arrayList;
public class Student {
	private String name;
	private int RollNo;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getRollNo() {
		return RollNo;
	}
	public void setRollNo(int rollNo) {
		RollNo = rollNo;
	}
	public Student(int rollNo, String name) {
		super();
		this.name = name;
		RollNo = rollNo;
	}
	@Override
	public String toString() {
		return "Student [name=" + name + ", RollNo=" + RollNo + "]";
	}
	
	
}
