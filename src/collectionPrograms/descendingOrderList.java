package collectionPrograms;

import java.util.ArrayList;
import java.util.TreeSet;

public class descendingOrderList {
	public static void main(String[] args) {
		
	ArrayList<Integer> arrayList=new ArrayList<Integer>();
	arrayList.add(2);
	arrayList.add(4);
	arrayList.add(8);
	arrayList.add(1);
	
	TreeSet<Integer> treeSet=new TreeSet<Integer>();
	treeSet.addAll(arrayList);
	
	System.out.println(treeSet.reversed());
	}
}
