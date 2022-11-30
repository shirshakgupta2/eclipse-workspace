
package ARRAYLIST;

import java.util.ArrayList;
import java.util.ListIterator;

public class LISTITERATOR {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList al = new ArrayList();
		al.add(10);
		al.add(20);
		al.add("rhoit");
		al.add("shirshak");
		al.add(99.9f);
		al.add("rhoit");
		System.out.println(al);
		
		ListIterator itr1 = al.listIterator();
		while(itr1.hasNext()== true) {
			System.out.println(itr1.next());
		}
		ListIterator itr = al.listIterator(3);
		
		System.out.println(itr.next());
		System.out.println(itr.next());
		System.out.println(itr.previous());
		System.out.println(itr.previous());
		System.out.println(itr.hasPrevious());
		System.out.println(itr.hasPrevious());
		
		
		System.out.println();
		System.out.println();
		System.out.println();
		
		
		while(itr.hasNext()== true) {
			System.out.println(itr.next());
		}
		

	}

}
