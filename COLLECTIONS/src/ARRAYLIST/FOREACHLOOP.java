
package ARRAYLIST;

import java.util.*;

public class FOREACHLOOP {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList al = new ArrayList();
		LinkedList ll = new LinkedList();
		ArrayDeque ad = new ArrayDeque();
		PriorityQueue pq = new PriorityQueue();
		TreeSet ts= new TreeSet();
		HashSet hs = new HashSet();
		LinkedHashSet lhs = new LinkedHashSet();
		
		
		al.add(10);
		al.add(20);
		al.add("rhoit");
		al.add(true);
		al.add(99.9f);
		al.add("rhoit");
		System.out.println(al);
		al.add(2,99);
		System.out.println(al);
		
		for(Object i:al) {
			System.out.println(i);
		}
		System.out.println();
		for(Object a:ll) {
			System.out.println(a);
		}
		System.out.println();
		
		for(Object i:ad) {
			System.out.println(i);
		}
		System.out.println();
		
		for(Object i:pq) {
			System.out.println(i);
			
		}
		System.out.println();
		
		for(Object i:ts) {
			System.out.println(i);
		}
		System.out.println();
		
		for(Object i:hs) {
			System.out.println(i);
		}
		System.out.println();
		
		

	}

}
