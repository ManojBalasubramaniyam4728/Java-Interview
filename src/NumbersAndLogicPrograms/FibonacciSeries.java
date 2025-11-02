package NumbersAndLogicPrograms;

public class FibonacciSeries {
	public static void main(String[] args) {
		int a = 0;
		int b = 1;
		int sum = 0;
		for (int i = 0; i <= 10; i++) {
			if (i <= 1) {
				System.out.println(i);
			}
			sum = a + b;
			a = b;
			b = sum;
			System.out.println(sum);
		}
	}

}
