package treeset;

import java.util.Comparator;
import java.util.TreeSet;

class MYCOMPARE1 implements Comparator {
	@Override
	public int compare(Object o1, Object o2) {
		
		
		Integer i1=(Integer) o1;
		Integer i2=(Integer) o2;
		
		return -1;
	}
}
public class insertiontreeset {
	public static void main(String[] args) {
		
		TreeSet<Integer> ts = new TreeSet<Integer>(new MYCOMPARE1());
		
		ts.add(20);
		ts.add(60);
		ts.add(160);
		ts.add(30);
		ts.add(80);
		ts.add(140);
		ts.add(180);
		System.out.println(ts);
	}

}
