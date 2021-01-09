package day1.practice;

public class switches {
	public static void main(String[] args) {
		int marks=6;
		switch(marks)
		{
		case 1:
			if(marks>=66 || marks<80)
			{
				System.out.println(" Distinction");
			}
			break;
		case 2:
			if(marks>=60 || marks<66 )
			{
				System.out.println("First Class");
			}
			break;
		
		case 3:
			if(marks>=55 || marks<60)
			{
				System.out.println("Higher Second Class");
			}
			break;
		case 4:
			if(marks>=50 || marks<55)
			{
				System.out.println("Second Class");
			}
			break;
		case 5:
			if(marks>=45 || marks<50)
			{
				System.out.println("Pass");
			}
			break;
		case 6:
			System.out.println("Absent for Exam");
			break;
	
			
		}
		
	}

}
