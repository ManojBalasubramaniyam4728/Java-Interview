package collectionPrograms;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

//Write code to remove duplicates from a List<Integer>.
public class DuplicatesFromAList {
	public static void main(String[] args) {
		List<Integer> data=new ArrayList<Integer>();
		data.add(1);
		data.add(2);
		data.add(1);
		data.add(3);
		data.add(2);
		data.add(12);
		
		System.out.println("The collention with duplicate is "+data);
		
		Set<Integer> dataToDuplicate=new LinkedHashSet<Integer>();
		dataToDuplicate.addAll(data);
		System.out.println("The collection without duplicate is "+dataToDuplicate);
	}

}
