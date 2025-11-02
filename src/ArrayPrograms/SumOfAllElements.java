package ArrayPrograms;

import java.util.Scanner;

public class SumOfAllElements {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Entter the how many index array you want");
		int a = sc.nextInt();
		int[] array = new int[a];
		for (int i = 0; i < array.length; i++) {
			System.out.println("Eneter the " + i + " inedx data");
			array[i] = sc.nextInt();
		}
		int sum=0;
		for (int i = 0; i < array.length; i++) {
			sum+=array[i];
		}
		System.out.println("Sum of the give array is "+sum);
		sc.close();
	}
}
