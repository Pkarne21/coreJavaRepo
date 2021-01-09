package Day3.bean;

public class Vehicles {
	private int model;
	private String name;
	private String color;
	
	public Vehicles()
	{
		
	}

	public Vehicles(int model, String name, String color) {
		super();
		this.model = model;
		this.name = name;
		this.color = color;
	}

	public int getModel() {
		return model;
	}

	public void setModel(int model) {
		this.model = model;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	@Override
	public String toString() {
		return "Vehicles [model=" + model + ", name=" + name + ", color=" + color + "]";
	}
	
}
