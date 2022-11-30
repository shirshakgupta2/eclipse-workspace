package HashMAP;

import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Set;

public class hashmapintro2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<String,String> map=new HashMap<String,String> ();
		map.put("firstname", "sommmana");
		map.put("surname", "mg");
		map.put("ph.num", "9898974575");
		map.put("password", "##90@@");
		map.put("DOB", "09/08/1995");
		map.put("gender", "male");
		
		
		Set<Entry<String, String>> entrys = map.entrySet();
		System.out.println(entrys);
		System.out.println();
		 for (Entry<String, String> entry : entrys) {
			System.out.println(entry);
			System.out.println(entry.getKey());
			System.out.println(entry.getValue());
			System.out.println(entry.getKey()+":"+entry.getValue());
		}

	}

}
