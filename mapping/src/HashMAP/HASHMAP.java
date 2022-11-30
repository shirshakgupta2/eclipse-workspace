package HashMAP;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Set;

public class HASHMAP {
	public static void main(String[] args) {
		HashMap<String,Integer> map=new HashMap<String,Integer> ();
		map.put(null, null);
		map.put("india", 90);
		map.put("china", 105);
		map.put("UK", 37);
		map.put("US", 50);
		map.put("russia", 37);
		map.put("Ukraine", 20);
		map.put("Africa", null);
		map.put("US", 200);
		System.out.println(map);
		System.out.println(map.values());
		Collection<Integer> values = map.values();
		Set<String> keys = map.keySet();
		Set<Entry<String, Integer>> entry = map.entrySet();
		System.out.println();
		for (Entry<String, Integer> en : entry) {
			System.out.println(en);
			System.out.println(en.getKey()+" : "+en.getValue());
			System.out.println();
		}
		for (Integer value : values) {
			System.out.println(value);
		}
		for (String key : keys) {
			System.out.println(key+" : "+ map.get(key));
		}

		
		
	}

}
