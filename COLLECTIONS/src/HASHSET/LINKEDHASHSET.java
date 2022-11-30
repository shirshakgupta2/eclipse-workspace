package HASHSET;

import java.util.HashSet;
import java.util.LinkedHashSet;

public class LINKEDHASHSET {
	public static void main(String[] args) {
		LinkedHashSet hs=new LinkedHashSet();
		hs.add(120);
		hs.add(60);
		hs.add(160);
		hs.add(40);
		hs.add(80);
		hs.add(140);
		hs.add(180);
		System.out.println(hs);
		
		
		for(Object i:hs) {
			System.out.println(i);
		}
		System.out.println();
	}

}
