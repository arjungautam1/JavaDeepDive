package map;


import java.util.*;

public class HashMapExample {
	public static void main(String[] args) {
		HashMap<Integer, String> map = new HashMap<Integer, String>();

		map.put(1, "Arjun");
		
		map.put(2, "Sammar");
		map.put(3, "Sammit");
		
		map.put(1,"Hari"); 
		//Using this duplication Arjun will be replaced by Hari 		
		map.put(7, "Ram");
		map.put(8, "Pooja");
		map.put(9,"Jeena");
		map.put(4, "Ram");
		map.put(5, "Pooja");
		map.put(6,"Jeena");
		map.put(45, "Ram");
		map.put(34, "Pooja");
		map.put(12,"Jeena");
	
		
//		This will give in random order 
		
		
//		Using Set in details 
		
//		Set<Map.Entry<Integer,String>> s= map.entrySet();
//		for(Map.Entry<Integer, String> get:s)
//		{
//			System.out.println(get.getKey()+" "+get.getValue());
//		}
		
		
		System.out.println("Iterating HashMap..");
		for(Map.Entry m:map.entrySet()) {
			System.out.println(m.getKey()+" "+m.getValue());
		}

	}

}
