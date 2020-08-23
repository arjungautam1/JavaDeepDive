package map;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class GenericTypeExample {
	public static void main(String[] args) {
		Map<Integer, String> map = new HashMap<Integer, String>();
		map.put(100, "Arjun");
		map.put(101, "Pooja");
		map.put(102, "Ram");
//		Elements can traverse in any order

		Set<Map.Entry<Integer, String>> s = map.entrySet();
		for (Map.Entry<Integer, String> it : s) {
			System.out.println(it.getKey() + " " + it.getValue());
		}

//		This is better way 

		for (Map.Entry m : map.entrySet()) {
			System.out.println(m.getKey() + " " + m.getValue());

		}

	}

}
