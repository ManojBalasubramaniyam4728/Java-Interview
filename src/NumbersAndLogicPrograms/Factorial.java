package NumbersAndLogicPrograms;

public class Factorial {
	public static void main(String[] args) {
		int num = 5;
		int sum = 1;
		for (int i = num; i >= 1; i--) {
			sum = sum * i;
		}
		System.out.println("The Factorial of the number " + num + " is " + sum);
	}
}
