package TREEMAp;

import java.util.HashMap;
import java.util.TreeMap;

public class TreeMAP {
	public static void main(String[] args) {
		TreeMap<String,Integer> map=new TreeMap<String,Integer> ();
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
		System.out.println(map.firstKey());
		System.out.println(map.lastKey());
		System.out.println(map.headMap("US"));
		System.out.println(map.tailMap("US"));
		System.out.println(map.subMap("india","US"));
	}

}
