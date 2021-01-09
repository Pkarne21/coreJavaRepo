package day2.arrays;

public class Example5 {
	// update existing values of an array
	public static void main(String[] args) {
	String[] cars = {"BMW", "Volvo", "Honda", "Hyundai"};
	cars[0] = "Audi";
	cars[1]="Indica";
	for(String x:cars) {
	System.out.println(x);
	}

}
}
