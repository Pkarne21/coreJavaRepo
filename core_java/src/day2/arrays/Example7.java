package day2.arrays;

public class Example7 {
	public static void main(String[] args) {
		int[][] myNumbers = {{40, 32, 55}, {23, 35, 61}};
		for(int i=0;i<myNumbers.length;i++)
		{
			int[] innerArray=myNumbers[i];
			for(int j=0;j<innerArray.length;j++)
				System.out.println(innerArray[j]);
		}
		
	}
	
    

}
