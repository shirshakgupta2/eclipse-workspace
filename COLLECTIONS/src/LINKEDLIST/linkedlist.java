package LINKEDLIST;

import java.util.LinkedList;

public class linkedlist {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList ll=new LinkedList();
		ll.add(10);
		ll.add("name");
		ll.add(true);
		System.out.println(ll);
		ll.addFirst(40);
		System.out.println(ll);
		ll.addLast(60);
		//ll.add(10);
		
		System.out.println(ll);
		System.out.println(ll.getFirst());// gives an
		//ABRUPT termination while linked list is empty but when its not empty  it works properly and same as peek first
		System.out.println(ll.getLast());
		
		// when you want to retrive first data only 
		System.out.println(ll.peekFirst()); // more prefreable then getfirst becoz it does'n't give exception while in empty linked list
		System.out.println(ll);
		System.out.println(ll.peekLast());
		System.out.println(ll);
		
		
		// when you call pollfisrt it retrives first data and delete it from my collection
		System.out.println(ll.pollFirst());
		System.out.println(ll);
		System.out.println(ll.pollLast());
		System.out.println(ll);
		
		
		System.out.println();
		
		for(Object i:ll) {
			System.out.println(i);
		}
		System.out.println();
	

	}

}
