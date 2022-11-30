package LINKEDLIST;
 
import java.util.LinkedList;

public class link2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList ll=new LinkedList();
		ll.push(10);
		System.out.println(ll);
		ll.push(20);
		System.out.println(ll);
		ll.push(30);
		System.out.println(ll);
		
		ll.push(40);
		System.out.println(ll);
		ll.pop();
		System.out.println(ll);
		ll.pop();
		System.out.println(ll);
		ll.pop();
		System.out.println(ll);
		ll.pop();
		System.out.println(ll);
		
		
		
		
		
		try {
			System.out.println(ll.getLast());
		} catch (Exception e) {
			// TODO: handle exception
			e.getStackTrace();
			System.out.println("exception handeled");
		}
		
			//System.out.println(ll.getLast());
		System.out.println(ll.peekFirst());

	}

}
