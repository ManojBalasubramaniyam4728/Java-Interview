package StringClassPrograms;

class removeWhiteSpacesInString {
	public static void main(String[] args) {

		System.out.println("==================== one way ===============");
		String var = " manoj balasubramaniyam ";
		String removeVar = "";
		for (int i = 0; i <= var.length() - 1; i++) {
			if (var.charAt(i) != ' ') {
				removeVar += var.charAt(i);
			}
		}
		System.out.println(removeVar);
		
		
	}
}
