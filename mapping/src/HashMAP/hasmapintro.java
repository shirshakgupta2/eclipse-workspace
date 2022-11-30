package HashMAP;

import java.util.Collection;
import java.util.HashMap;
import java.util.Set;

public class hasmapintro {
	public static void main(String[] args) {
		HashMap<String,String> map=new HashMap<String,String> ();
		map.put("firstname", "sommmana");
		map.put("surname", "mg");
		map.put("ph.num", "9898974575");
		map.put("password", "##90@@");
		map.put("DOB", "09/08/1995");
		map.put("gender", "male");
		
		System.out.println(map);
		System.out.println();
		
		Collection<String> values = map.values();
		System.out.println(map.values());
		
		System.out.println();
		System.out.println(values);
		
		System.out.println();
		for (String value : values) {
			System.out.println(value);
		}
		
		System.out.println();
		Set<String>  keys = map.keySet();
		
		System.out.println(keys);
		System.out.println();
		
		for (String key : keys) {
			System.out.println(key);
			System.out.println(key+"="+map.get(key));
			System.out.println();
			
			
		}
		
	}

}
