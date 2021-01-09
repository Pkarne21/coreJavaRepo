package Day4.arrayList;

import java.util.ArrayList;
import java.util.Collections;

public class Example8 {

 public static void main(String[] args) {
ArrayList<String> cars = new ArrayList<String>();
cars.add("Volvo");
cars.add("Ford");
cars.add("Honda");
cars.add("Hyundai");

Collections.sort(cars);
//Collections.sort(cars, Collections.reverseOrder());
for(String x:cars) {
System.out.println(x);
}
 }
}