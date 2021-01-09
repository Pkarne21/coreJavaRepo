package Day5.setExamples;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Example4 {
	public static void main(String[] args) {
		Set<String> countries = new HashSet<String>();

		countries.add("India");
		countries.add("America");
		countries.add("Afghanistan");
		countries.add("Pakistan");

		Iterator<String> iter = countries.iterator();
		while (iter.hasNext()) {
		String x = iter.next();
		System.out.println(x);
		}

}
}
