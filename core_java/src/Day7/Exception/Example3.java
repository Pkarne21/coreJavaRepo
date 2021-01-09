package Day7.Exception;

public class Example3 {
	public static void checkAge(int age) throws Exception {
		if (age < 18) {
		throw new Exception("Access denied - You must be at least 18 years old.");
		} else {
		System.out.println("Access granted - You are old enough!");
		}
		}

		 public static void main(String[] args) {
		try {
		checkAge(14);
		} catch (Exception e) {

		 System.out.println("Something went wrong:" + e.getMessage());
		}
		}
}