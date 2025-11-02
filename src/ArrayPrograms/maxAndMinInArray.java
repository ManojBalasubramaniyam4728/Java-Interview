package ArrayPrograms;

import java.util.Arrays;
import java.util.Scanner;

public class maxAndMinInArray {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Entter the how many index array you want");
		int a = sc.nextInt();
		int[] array = new int[a];
		for (int i = 0; i < array.length; i++) {
			System.out.println("Eneter the " + i + " inedx data");
			array[i] = sc.nextInt();
		}
		
		//one way
		int max=Arrays.stream(array).max().getAsInt();
		int min=Arrays.stream(array).min().getAsInt();
		
		//another way
		for (int i = 0; i < array.length; i++) {
			for (int j = 1 + i; j < array.length; j++) {
				if(array[i]>array[j]) {
					int temp=array[i];
					array[i]=array[j];
					array[j]=temp;
				}
			}
		}
		System.out.println(Arrays.toString(array));
		System.out.println("The grater number in array is "+max);
		System.out.println("The smallest number in array is "+min);
		System.out.println("=========================================");
		System.out.println("The grater number in array is "+(array[array.length-1]));
		System.out.println("The smallest number in array is "+(array[0]));
		sc.close();
	}

}
