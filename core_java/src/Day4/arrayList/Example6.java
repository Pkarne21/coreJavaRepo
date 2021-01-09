package Day4.arrayList;

import java.util.ArrayList;
import java.util.Scanner;

public class Example6 {
	//Adding of values in arrayList usinf Scanner and loops
	//run for loop to add four cities in arraylist of string and display all
	//names of cities should be received by user input using Scanner
	public static void main(String[] args) {
		ArrayList<String> cityList = new ArrayList<String>();
		Scanner sc=new Scanner(System.in);
	
		
		
		for(int i=0;i<4;i++)
		{
			System.out.println("Adding cities...");
			String city=sc.nextLine();
			cityList.add(city);
		}
		System.out.println(cityList);
		
		
	}

}
