package Day7.Exception.user_defined_exceptions;

public class AgeNotValidException {

	 public AgeNotValidException() {
	System.out.println("Age must be more than 18");
	}
	public AgeNotValidException(String message) {
	System.out.println(message);
	}

}
