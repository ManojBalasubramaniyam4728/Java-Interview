package collectionPrograms;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

//You have a List<String> of employee names. How would you sort it in reverse alphabetical order?
public class reverseAlphabeticalOrderList {
	public static void main(String[] args) {
		List<String> employeeNamesList = new ArrayList<String>();
		employeeNamesList.add("Praveen");
		employeeNamesList.add("Manoj");
		employeeNamesList.add("Sanjay");

		System.out.println("The emploname inerstion order is " + employeeNamesList);
		Set<String> employeeNamesSet = new TreeSet<String>();
		for (String string : employeeNamesList) {
			employeeNamesSet.add(string);
		}

		System.out.println("The emploname natural order is " + employeeNamesSet);

		List<String> employeeNamesListRevers = new ArrayList<String>();

		for (String string : employeeNamesSet) {
			employeeNamesListRevers.add(string);
		}
		
		List<String> employeeNamesListReversOrder = new ArrayList<String>();
		
		for (int i = employeeNamesListRevers.size()-1; i >=0; i--) {
			employeeNamesListReversOrder.add(employeeNamesListRevers.get(i));
		}
		
		System.out.println("The emploname revers order is " + employeeNamesListReversOrder);
	}
}
