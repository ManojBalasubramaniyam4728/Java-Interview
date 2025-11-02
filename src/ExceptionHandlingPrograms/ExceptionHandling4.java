package ExceptionHandlingPrograms;

//Exception Handling finally block
public class ExceptionHandling4 {
	public static void main(String[] args) {
		try {
			int a = 10 / 0;
			System.out.println(a);
		} catch (ArithmeticException e) {
			System.out.println("Handled Exception super");
		}
		finally {
			System.out.println("I will execute what ever happens");
		}
		
	}

}
