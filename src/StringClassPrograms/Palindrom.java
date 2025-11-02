package StringClassPrograms;

public class Palindrom {
	public static void main(String[] args) {
		String var = "DooD";
		String RevVar = "";
		for (int i = var.length() - 1; i >= 0; i--) {
			RevVar += var.charAt(i);
		}
		System.out.println(var + " This is actaual value");
		System.out.println(RevVar + " This is expeceted value");

		if (RevVar.equalsIgnoreCase(var)) {
			System.out.println(var + " This is a Palindrom");
		} else {
			System.out.println(var + " This not is a Palindrom");
		}
	}
}
