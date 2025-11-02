package StringClassPrograms;

public class RemoveSpecialCharactersInString {
	 public static void main(String[] args) {
	      String var="asd@34gmng*(";
	      String cleanVar= "";
	      cleanVar=var.replace("@", "").replace("*", "").replace("(","");
	      System.out.println(cleanVar);
	    }
}
