//WAP to to create a arraylist and print element in forward and backwad 
//direction using list iterator
package ARRAYLIST;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.Scanner;

public class forwardandbackward {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> list = new ArrayList<Integer>();
		
		Scanner scan=new Scanner (System.in);
		
		while(scan.hasNextInt()) {
			list.add(scan.nextInt());
		}
		
		Iterator<Integer> iterator = list.iterator();
		while(iterator.hasNext()) {
			System.out.println(iterator.next());
		}
		ListIterator<Integer> iterator1 = list.listIterator();
		
		System.out.println();
		System.out.println("using listiterator  forward outputs are");
		while(iterator1.hasNext()) {
			System.out.println(iterator1.next());
		}
		System.out.println("using listiterator in backward outputs are");
		while(iterator1.hasPrevious()) {
			System.out.println(iterator1.previous());
		}
		
		ArrayList<String> list1 = new ArrayList<String>();
		while(!scan.hasNext("exit")) {
			list1.add(scan.next());
		}
		
		System.out.println();
		 
		ListIterator<String> iterator2 = list1.listIterator();
		
		System.out.println("using listiterator  forward outputs are");
		while(iterator2.hasNext()) {
			System.out.println(iterator2.next());
		}
		System.out.println("using listiterator in backward outputs are");
		while(iterator2.hasPrevious()) {
			System.out.println(iterator2.previous());
		}
		
		
		
	
				

	}

}
