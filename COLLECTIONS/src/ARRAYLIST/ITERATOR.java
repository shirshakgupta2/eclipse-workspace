package ARRAYLIST;

import java.util.ArrayList;
import java.util.Iterator;

public class ITERATOR {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList al = new ArrayList();
		al.add(10);
		al.add(20);
		al.add("rhoit");
		al.add(true);
		al.add(99.9f);
		al.add("rhoit");
		System.out.println(al);
		
		Iterator itr=al.iterator();
		System.out.println(itr.next());
//		System.out.println(itr.next());
//		System.out.println(itr.next());
//		System.out.println(itr.next());
//		System.out.println(itr.next());
//		System.out.println(itr.next());
//		System.out.println(itr.next());
		/*
		 * Exception in thread "main" java.util.NoSuchElementException
	at java.base/java.util.ArrayList$Itr.next(ArrayList.java:970)
	at ARRAYLIST.ITERATOR.main(ITERATOR.java:26)
		 */
		while(itr.hasNext()== true) {
			System.out.println(itr.next());
		}
		

	}

}
