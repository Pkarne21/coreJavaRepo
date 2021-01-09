package Day6;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

import Day5.hashmapExamples.EmployeeBean;

public class TestGame {
public static void main(String[] args) {
		
		GameBean g = new GameBean("DOTA", 1 , 20);
		GameBean g1 = new GameBean("CS", 2 , 10);
		GameBean g2 = new GameBean("VALO", 3 , 10);
		GameBean g3 = new GameBean("Rocket Leauge", 4 , 6);
		Map<Integer,GameBean> games =new HashMap<Integer,GameBean>();
		
		
		 games.put(1001,g);
		 games.put(1002,g1);
		 games.put(1003,g2);
		 games.put(1004,g3);
		
		
		 Set<Integer>keyOfSet=games.keySet();
			for(int x:keyOfSet)		
			{
				GameBean gam=games.get(x);
				System.out.println(gam);
			}		
			
		    	  
	
}

}
