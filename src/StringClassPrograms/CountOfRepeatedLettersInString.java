package StringClassPrograms;

public class CountOfRepeatedLettersInString {
    public static void main(String[] args) {
        String var = "abbccaffmm";
        char[] c = var.toCharArray();
        String duplicate = "";

        for (int i = 0; i < c.length; i++) {
            if (duplicate.indexOf(c[i]) == -1) {
                int count = 1;
                for (int j = i + 1; j < c.length; j++) {
                    if (c[i] == c[j]) {
                        count++;
                    }
                }
                duplicate += c[i];
                System.out.println(c[i] + " " + count);
            }
        }
    }
}
