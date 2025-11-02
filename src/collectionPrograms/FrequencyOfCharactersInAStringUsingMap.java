package collectionPrograms;

import java.util.LinkedHashMap;
import java.util.Map;

//Write a Java program to count the frequency of characters in a string using Map.
/*Example
 * String data= "hello";
 * 
 * outPut:-
     h → 1  
     e → 1  
     l → 2  
     o → 1
 * */
public class FrequencyOfCharactersInAStringUsingMap {
	public static void main(String[] args) {
		String myName = "Manoj Balasubramaniyam";
		myName = myName.toLowerCase();
		myName = myName.replace(" ", "");

		Map<Character, Integer> keyValue = new LinkedHashMap<>();

		for (int i = 0; i < myName.length(); i++) {
		    char ch = myName.charAt(i);
		    if (keyValue.containsKey(ch)) {
		        keyValue.put(ch, keyValue.get(ch) + 1);
		    } else {
		        keyValue.put(ch, 1);
		    }
		}

		for (Map.Entry<Character, Integer> entry : keyValue.entrySet()) {
		    System.out.println(entry.getKey() + " → " + entry.getValue());
		}

		
	}

}
