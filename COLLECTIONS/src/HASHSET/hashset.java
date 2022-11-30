package HASHSET;

import java.util.HashSet;

public class hashset {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashSet hs=new HashSet();
		hs.add(120);
		hs.add(60);
		hs.add(160);
		hs.add(40);
		hs.add(80);
		hs.add(140);
		System.out.println(hs.add(180));
		System.out.println(hs);
		
		for(Object i:hs) {
			System.out.println(i);
		}
		System.out.println();

	}

}
