package day2.poojaExamples;

public class method {
	public static void rectangle(int length,int breath)
	{
		int rectArea=length*breath;
		System.out.println(rectArea);
	}
	public static void triangle(int height,int base)
	{
		int triArea=(height*base)/2;
		System.out.println(triArea);
	}
	public static void main(String[] args) {
		rectangle(7,8);
		triangle(2,9);
	}

}
