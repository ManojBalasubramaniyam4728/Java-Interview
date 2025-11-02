package StringClassPrograms;

public class ToMakeStringMutable {

	public static void main(String[] args) {
		// StringBuffer
		StringBuffer sb = new StringBuffer("Welcome"); // String to make mutable
		System.out.println("After concat or appaend " + sb); // Welcome
		sb.append(" To The java world");
		System.out.println("After concat or appaend " + sb); // Welcome To The java world

		System.out.println("======================================= ");

		// StringBuffer
		StringBuilder sf = new StringBuilder("Welcome"); // String to make mutable
		System.out.println("After concat or appaend " + sf); // Welcome
		sb.append(" To The java world");
		System.out.println("After concat or appaend " + sf); // Welcome To The java world
		
		System.out.println("======================================= ");

		System.out.println("Use of StringBuffer");

		System.out.println("1. Thread-Safe, 2. lettel Slow, 3. Good for multi-thread env, 4. Realse version 1.0");

		System.out.println("Use of StringBuilder");

		System.out.println("1. Not Thread-Safe, 2. faster, 3. Not good for multi-thread env, 4. Realse version 1.5");
	}

}
