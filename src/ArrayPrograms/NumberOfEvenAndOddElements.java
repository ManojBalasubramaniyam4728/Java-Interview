package ArrayPrograms;

import java.util.Scanner;

public class NumberOfEvenAndOddElements {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Entter the how many index array you want");
		int a = sc.nextInt();
		int[] array = new int[a];
		for (int i = 0; i < array.length; i++) {
			System.out.println("Eneter the " + i + " inedx data");
			array[i] = sc.nextInt();
		}
		int evenCount=0;
		int oddCount=0;
		for (int i = 0; i < array.length; i++) {
			if (array[i]%2==0) {
				evenCount++;
			}
			else {
				oddCount++;
			}
		}
		System.out.println("The even count in array is "+evenCount);
		System.out.println("The even count in array is "+oddCount);
		sc.close();
	}

}
