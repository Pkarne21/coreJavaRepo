package day2.method;

public class Ass {// Java program to print Fizz Buzz
	
	
	
		public static void main(String args[])
		{ 
			/*
			int n = 100;
			for(int i=0;i<=100;i++)
			{
				if(i%3==0 && i%5==0)
				{
					System.out.println("FizzBuzz");
				}
				else if(i%3==0)
				{
					System.out.println("Fizz");
				}
				else if(i%5==0)
				{
					System.out.println("Buzz");
				}
				else
					System.out.println(i);
				
				
			}
*/
			int a[] = {1,2,3,4,5};
			int d[] = a;
			System.out.println(d[0]);
			int sum = 0;
			for (int j = 0; j < 3; ++j)
			sum += (a[j] * d[j + 1]) + (a[j + 1] * d[j]);
			System.out.println(sum);
		}
	}

	


