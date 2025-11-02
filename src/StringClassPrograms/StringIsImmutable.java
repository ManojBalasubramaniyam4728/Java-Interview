package StringClassPrograms;

import java.util.Arrays;

public class StringIsImmutable {

	public static void main(String[] args) {
		int[] in = { 60, 20, 50, 30 }; // mutable
		System.out.println("Befour sort :" + Arrays.toString(in)); // {60,20,50,30}
		Arrays.sort(in);
		System.out.println("After sort :" + Arrays.toString(in)); // {20,30,50,60}

		String s = "welcome"; // immtable
		System.out.println("Befour concat "+s); //welcome
		s.concat("To java world");
		System.out.println("After concat "+s); //welcome
	}

}
