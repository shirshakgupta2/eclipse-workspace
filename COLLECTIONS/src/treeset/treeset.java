package treeset;
import java.util.Iterator;
import java.util.TreeSet;

public class treeset {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeSet ts = new TreeSet();
		
		ts.add(20);
		ts.add(60);
		ts.add(160);
		ts.add(30);
		ts.add(80);
		ts.add(140);
		ts.add(180);
		System.out.println(ts);
		
		System.out.println(ts.ceiling(150));// gives imidiate greater value then 150
		System.out.println(ts.floor(150));
		
		System.out.println();
		System.out.println(ts.higher(150));
		System.out.println(ts.lower(150));

		System.out.println();
		System.out.println(ts.ceiling(160));
		System.out.println(ts.higher(160));
		
		System.out.println();
		System.out.println(ts.floor(160));
		System.out.println(ts.lower(160));
		
		
		for(Object i:ts) {
			System.out.println(i);
		}
		System.out.println();
	
		
	}

}
