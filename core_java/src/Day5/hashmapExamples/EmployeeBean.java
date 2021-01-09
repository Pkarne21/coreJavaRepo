package Day5.hashmapExamples;

public class EmployeeBean {
	private int id;
	private String name;
	EmployeeBean()
	{
		
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public EmployeeBean(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	@Override
	public String toString() {
		return "EmployeeBean [id=" + id + ", name=" + name + "]";
	}
	

}
