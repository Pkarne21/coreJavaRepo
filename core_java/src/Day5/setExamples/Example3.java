package Day5.setExamples;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Example3 {
	public static void main(String[] args) {
		Set<String> countries = new HashSet<String>();

		countries.add("India");
		countries.add("America");
		countries.add("Afghanistan");
		countries.add("Pakistan");

		 
		for(String x:countries) {
			System.out.println(x);
			};
		}

}
