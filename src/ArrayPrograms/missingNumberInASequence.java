package ArrayPrograms;

public class missingNumberInASequence {
	public static void main(String[] args) {

		int[] data = { 1, 2, 3, 4, 5,7 };

		int lengthdata = data.length + 1;
		int actualevalue = lengthdata * (lengthdata + 1) / 2;
		int value = 0;
		for (int i : data) {
			value += i;
		}
      int expectedvalue=actualevalue-value;
      System.out.println(expectedvalue);
	}
}
