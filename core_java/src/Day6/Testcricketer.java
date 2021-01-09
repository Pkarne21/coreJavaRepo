package Day6;

import java.util.HashSet;
import java.util.Iterator;

import java.util.*;
import java.util.Set;

public class Testcricketer {
	public static void main(String[] args) {
		CricketerBean player1 = new CricketerBean(10, "Sachin");
		CricketerBean player2 = new CricketerBean(18, "Virat");
		CricketerBean player3 = new CricketerBean(12, "Yuvraj");
		CricketerBean player4 = new CricketerBean(7, "Dhoni");
		Set<CricketerBean> playersList = new HashSet<CricketerBean>();
		 playersList.add(player1);
		 playersList.add(player2);
		 playersList.add(player3);
		 playersList.add(player4);
		 for(CricketerBean x:playersList)
		 {
			 System.out.println(x);
		 }
			
	
	
	
	
	
	
	Iterator<CricketerBean> iterator = playersList.iterator();
	while (iterator.hasNext()) 
        System.out.println(iterator.next() + " "); 
	System.out.println();
	

	
	}

}
