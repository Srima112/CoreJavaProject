package Collection;

import java.util.HashMap;

public class MapExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		HashMap<String,Integer> basket=new HashMap<String,Integer>();
		
		basket.put("item1", 1);
		basket.put("item2", 2);
		basket.put("item3", 3);
		basket.put("item4", 4);
		
		System.out.println("The map is"+basket);
		
		basket.put("item3", 2);
		System.out.println("The map after change is"+basket);
		
		basket.remove("item2");
		System.out.println("The map after removing is"+basket);
		
		/*For each Loop
		for(String item:basket.keySet())
		{
			System.out.println("Item name is:"+item);
			System.out.println("Item quanity is:"+basket.get(item));
			
		}*/
	
	for(Integer val:basket.values())
	{
		System.out.println("Item value is:"+ +val);
		
	}
	}

}
