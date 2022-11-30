package VEctor;

import java.util.Enumeration;
import java.util.Vector;

public class VECTOR {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Vector al=new Vector();
		al.add(10);
		al.add(20);
		al.add("rhoit");
		al.add(true);
		al.add(99.9f);
		al.add("rhoit");
		System.out.println(al);
		
		Enumeration itr = al.elements();
		itr.hasMoreElements();
		System.out.println(itr.nextElement());
		while(itr.hasMoreElements()) {
			System.out.println(itr.nextElement());
			
		}
	
		

	}

}
