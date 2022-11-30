package ARRAYLIST;

import java.util.ArrayList;

public class buildin2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList al = new ArrayList();
		al.add(10);
		al.add(20);
		al.add(50);
		al.add("rhoit");
		al.add(true);
		al.add(99.9f);
		al.add("rhoit");
		
		System.out.println(al);
		System.out.println(al.size()); 
		al.trimToSize();
		System.out.println(al);
		
		
		// methods to retrive data
		
		ArrayList b= new ArrayList();
		b.add("rhoit");
		b.add(50);
		System.out.println(b);
		System.out.println(al.containsAll(b));
		System.out.println(al.contains(50));
		al.retainAll(b);
		System.out.println(al);
		System.out.println(al.getClass());
		
		ArrayList c = (ArrayList) b.clone();
		System.out.println(c);
		 
		 
		 

	}

}
