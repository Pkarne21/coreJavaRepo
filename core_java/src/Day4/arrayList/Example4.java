package Day4.arrayList;

import java.util.*;

public class Example4 {

 public static void main(String[] args) {
	ArrayList<String> cars = new ArrayList<String>();
	cars.add("Volvo");
	cars.add("Ford");
	cars.add("Honda");
	cars.add("Hyundai");
	Iterator<String> iter = cars.iterator();
	while(iter.hasNext()) {
	String x = iter.next();
	System.out.println(x);
}

}
}