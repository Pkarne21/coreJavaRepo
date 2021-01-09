package day1.switches;

public class Example2 {
	public static void main(String[] args) {
		int marks=1;
		switch(marks)
		{
		case 1:
			if(marks<60)
			System.out.println("Higher second class");
			break;
		case 2:
			if(marks<=60)
			System.out.println("First class");
			break;
		case 3:
			if(marks>61)
			System.out.println("First class with distinction");
			break;
		}
		
			
	}

}
