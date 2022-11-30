package LINKEDLIST;

import java.util.Iterator;
import java.util.LinkedList;

public class LINKEdITREATIROR {
	public static void main(String[] args) {
		LinkedList ll=new LinkedList();
		ll.add(10);
		ll.add("name");
		ll.add(true);
		System.out.println(ll);
		
		
		ll.addFirst(40);
		System.out.println(ll);
		
		
		ll.addLast(60);
		System.out.println(ll);
		
		Iterator itr = ll.descendingIterator();
		
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
	}

}
