package StringClassPrograms;

public class StringRevers {
	public static void main(String[] args) {

		String data = "manoj";
		String revData = "";
		char[] stringToChar = data.toCharArray();
		for (int i = stringToChar.length - 1; i >= 0; i--) {
			revData += stringToChar[i];
		}
		System.out.println("the Reveresed String is "+ revData);
	}
}
