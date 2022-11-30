package treeset;

import java.util.Comparator;
import java.util.TreeSet;
class MYCOMPARE implements Comparator {
	@Override
	public int compare(Object o1, Object o2) {
		
		
		Integer i1=(Integer) o1;
		Integer i2=(Integer) o2;
		
		//return i1-i2;
//		return i2-i1;
//		return i1.compareTo(i2);
		return i1.compareTo(i2)*-1;
		
				
	}
}

class sorttreeset {
	public static void main(String[] args) {
		
		MYCOMPARE mycom= new MYCOMPARE();
		
		TreeSet<Integer> ts = new TreeSet<Integer>(mycom);
		
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
