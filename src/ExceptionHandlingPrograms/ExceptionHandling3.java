package ExceptionHandlingPrograms;

//Exception Handling to use our own Exception
@SuppressWarnings("serial")
public class ExceptionHandling3 extends RuntimeException {
	ExceptionHandling3(String message) {
		super(message);
	}

	public static void main(String[] args) {
		int age = 14;
		if (age >= 18) {
			System.out.println("Person can vote");
		} else {
			throw new ExceptionHandling3("young age expection");
		}

	}

}
