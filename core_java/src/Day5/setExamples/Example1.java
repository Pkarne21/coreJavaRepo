package Day5.setExamples;

import java.util.HashSet;
import java.util.Set;

public class Example1 {
	public static void main(String[] args) {
		Set<Integer> setOfIds = new HashSet<Integer>();
		setOfIds.add(34213);
		setOfIds.add(21342);
		setOfIds.add(54365);
		setOfIds.add(87123);
		// System.out.println(setOfIds);
		for(int x:setOfIds) {
		System.out.println(x);
		}
		}

}
