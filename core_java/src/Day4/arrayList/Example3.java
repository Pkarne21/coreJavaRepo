package Day4.arrayList;

import java.util.ArrayList;

public class Example3 {
	public static void main(String[] args) {
		ArrayList<String> cars=new ArrayList<String>();
		cars.add("Volvo");
		cars.add("Ford");
		cars.add("Honda");
		cars.add("Hyundai");
		for (String a :cars) 
		{ 
		  System.out.println(a);
		}
		
}
}
