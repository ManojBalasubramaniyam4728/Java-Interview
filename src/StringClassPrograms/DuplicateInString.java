package StringClassPrograms;

public class DuplicateInString {
	public static void main(String[] args) {
		String data="manojSanjayPraveen";
		String duplicate="";
		char[] ch=data.toCharArray();
		for (int i = 0; i < ch.length; i++) {
			if (duplicate.indexOf(ch[i])==-1) {
				duplicate+=ch[i];
			}
		}
		System.out.println(duplicate);
	}

}
