package ARRAYLIST;

import java.util.ArrayList;

public class arraylist {
	public static void main(String[] args) {
		ArrayList al = new ArrayList();
		al.add(10);
		al.add(20);
		al.add("rhoit");
		al.add(true);
		al.add(99.9f);
		al.add("rhoit");
		System.out.println(al.get(0));
		System.out.println(al);
		al.add(2,99);
		
		System.out.println(al);
		//System.out.println(al.get(10));
		ArrayList b = new ArrayList();
		b.add(100);
		b.add(200);
		b.add(300);
		b.add(400);
		
		System.out.println(b);
		al.addAll(b); 
		System.out.println(al);
		al.addAll(2, b);
		System.out.println(al);
		//al.replaceAll(null);
		Integer[]a=new Integer[al.size()];
		al.toArray(a);
		for (int i = 0; i < a.length; i++) {
			System.out.println(a[i]);
		}
	}

}