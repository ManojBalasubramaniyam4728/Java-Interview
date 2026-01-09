package StringClassPrograms;



public class FirstNonRepeatingChar {
    public static void main(String[] args) {
        String input = "aab";
        Character result = null;

        for (int i = 0; i < input.length(); i++) {
            char c = input.charAt(i);
            if (input.indexOf(c) == input.lastIndexOf(c)) {
                result = c;
                break;
            }
        }

        if (result != null) {
            System.out.println("First non-repeating character: " + result);
        } else {
            System.out.println("No non-repeating character found.");
        }
        
     }
}
