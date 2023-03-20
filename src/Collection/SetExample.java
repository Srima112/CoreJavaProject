package Collection;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.TreeSet;

public class SetExample {
	
	public static void main (String args[]) {
		HashSet<String> set1 = new HashSet<>();
		set1.add("Andrew");
		set1.add("Bob");
		set1.add("Dan");
		set1.add("Ciara");
		set1.add(null);
		set1.add("Andrew");
		System.out.println("Set 1 (Hash Set) : "+set1);
		
		
		//Tree Set
		
		TreeSet<String> set2 = new TreeSet<>();
		set2.add("Andrew");
		set2.add("Bob");
		set2.add("Dan");
		set2.add("Ciara");
		set2.add("Andrew");
		System.out.println("Set 2 (Tree Set Sorted always) : "+set2);
		
		List<String> list1=new ArrayList<String>(set1);
		
		System.out.println("elements of an ararylist : "+list1);
	}
}
