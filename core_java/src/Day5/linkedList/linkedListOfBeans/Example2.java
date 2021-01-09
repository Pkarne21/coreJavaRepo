package Day5.linkedList.linkedListOfBeans;

import java.util.Collections;
import java.util.LinkedList;

public class Example2 {
	// ArrayList of salaries (int)
	public static void main(String[] args) {
	LinkedList<Integer> salariesList = new LinkedList<Integer>();
	salariesList.add(15000);
	salariesList.add(16000);
	salariesList.add(10000);
	salariesList.add(5000);
	Collections.sort(salariesList); // for sorting in ascending order
	//Collections.sort(salariesList, Collections.reverseOrder()); // for sorting in descending order
	for(int x:salariesList) {
	System.out.println(x);
	}

	}

}
