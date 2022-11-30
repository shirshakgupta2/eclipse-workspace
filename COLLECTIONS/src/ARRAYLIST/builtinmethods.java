package ARRAYLIST;

import java.util.ArrayList;

public class builtinmethods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList al = new ArrayList();
		al.add(10);
		al.add(20);
		al.add("rhoit");
		al.add(true);
		al.add(99.9f);
		al.add("rhoit");
		// methods to retrive data
		System.out.println(al);
		System.out.println(al.get(2));
		System.out.println(al.subList(0, 3));
		System.out.println(al.indexOf("rhoit"));
		System.out.println(al.lastIndexOf("rhoit"));
		
		// methods to remove data
		al.remove(1);
		System.out.println(al);
		al.remove(new Integer(10));
		System.out.println(al);
		al.add(200);
		al.add("shirshak");
		al.add(50);
		al.add(3300);
		
		System.out.println(al);
		al.remove("shirshak");
		System.out.println(al);
		
		ArrayList b= new ArrayList();
		 b.add("rhoit");
		 b.add(50);
		 System.out.println(b);
		 al.removeAll(b);
		 System.out.println(al);
		 
		 al.clear();
		 System.out.println(al);
		  
	}

}
