package Day7.Exception;

public class Example1 {
	public static void main(String[ ] args) {
		try {
		int[] myNumbers = {1, 2, 3};
		System.out.println(myNumbers[10]);
		} catch (Exception e) {
		System.out.println("Something went wrong.");
		}
		}

}
