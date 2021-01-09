package Day5.hashmapExamples;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Example1 {
	public static void main(String[] args) {
		Map<Integer, String> mapOfCities = new HashMap<Integer, String>();
		mapOfCities.put(10, "Pune");
		mapOfCities.put(13, "Mumbai");
		mapOfCities.put(83, "Sydney");
		mapOfCities.put(5, "Melbourne");
		mapOfCities.put(23, "Delhi");
		// System.out.println(mapOfCities);
		Set<Integer> keysSet = mapOfCities.keySet();
		for(int x:keysSet) {
		String city = mapOfCities.get(x);
		System.out.println(x +" " +city);
		}
		}

}
