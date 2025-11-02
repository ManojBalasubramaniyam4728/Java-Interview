package ArrayPrograms;

import java.util.Arrays;
import java.util.Scanner;

public class ReverseArray {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Entter the how many index array you want");
		int a = sc.nextInt();
		int[] array = new int[a];
		for (int i = 0; i < array.length; i++) {
			System.out.println("Eneter the " + i + " inedx data");
			array[i] = sc.nextInt();
		}
		int [] reverarry= new int [a];
		int c=0;
		for (int i = 1; i <array.length+1; i++) {
			reverarry[c++]=array[array.length-i];
		}
			 System.out.println(Arrays.toString(reverarry));
			 sc.close();
	}

}
