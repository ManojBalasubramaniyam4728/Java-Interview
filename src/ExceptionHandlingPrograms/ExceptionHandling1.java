package ExceptionHandlingPrograms;

public class ExceptionHandling1 {
	//Exception Handling with try and catch
	public static void main(String[] args) {
		try {
			int a=10/0;
			System.out.println(a);
		} catch (ArithmeticException e) {
			System.out.println("Handled Exception super");
		}
	}

}
