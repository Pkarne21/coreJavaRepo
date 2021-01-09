package Day5.linkedList.linkedListOfBeans;

import java.util.LinkedList;

public class Example1 {
	public static void main(String[] args) {
		LinkedList<String> cars = new LinkedList<String>();
		cars.add("Volvo");
		cars.add("Ford");
		cars.add("Honda");
		cars.add("Hyundai");
		System.out.println(cars);
		// System.out.println(cars.get(2));
		System.out.println("updating volvo to opel");
		cars.set(0, "Opel");
		System.out.println(cars);
		System.out.println("removing index 2:");
		cars.remove(2);
		System.out.println(cars);
		System.out.println("Now removing all elements from cars LinkedList");
		cars.clear();
		System.out.println(cars);
		}

}
