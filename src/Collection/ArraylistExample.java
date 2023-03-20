package Collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;


public class ArraylistExample {

	private static final String HashMap = null;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String[] arr= {"sree","rajiv","romi","roji"};
		
		System.out.println("first value of an array is "+arr[0]);
		
		//Arraylist4
		
		List<String> list1=new ArrayList<String>();
		
		list1.add("sree");
		list1.add("rajiv");
		list1.add("romi");
		list1.add("roji");
		
		System.out.println("values of an list is "+list1);
		System.out.println("size of list is "+list1.size());
		System.out.println("first element in list is "+list1.get(0));
		System.out.println("last element in list is "+list1.get(list1.size()-1));

		list1.set(1,"saswati");
		System.out.println("values of an updated list is "+list1);

		list1.remove(2);
		System.out.println("values of after deleting index 2 "+list1);
		
		//Iterate through the list
		
		System.out.println("Element Names by using regular for loop:");
		for (int i=0; i<list1.size(); i++ ) {
			System.out.print(" "+list1.get(i));
		}
		
		System.out.println();
		
		System.out.println("Element Names by for each loop :");
		for (String value : list1) {
			System.out.print(" "+ value);

		}
		
		System.out.println();

		
		System.out.println("Element Names by using Iterator :");
		
		Iterator<String> itr = list1.iterator();
		
		while (itr.hasNext()) {
			System.out.print(" "+itr.next());
		}

		System.out.println();
		
		Collections.sort(list1);
		System.out.println("regular sort :"+list1);
		
		String Str="Clean India Green India Happy India ";
		
		String[] array= Str.split(" ");
		HashMap<String,Integer> map1=new HashMap<String,Integer>();
		
		for(String word: array)
		{
			if(!map1.keySet().contains(word))
			{
				map1.put(word, 1);
			}
			else
			{
				map1.put(word,(map1.get(word)+1));
			}
		}
		System.out.println("The resulting map is"+map1);




	}

}
