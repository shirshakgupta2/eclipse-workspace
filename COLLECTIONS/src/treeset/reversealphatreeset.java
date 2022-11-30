package treeset;

import java.util.Comparator;
import java.util.TreeSet;

class MYCOMPARE2 implements Comparator {
	@Override
	public int compare(Object o1, Object o2) {
		
		
//		String i1= (String)o1;
//		String i2= (String)o2;
		
		//return i1-i2;
		return ((String)o2).compareTo((String)o1);
	}
}
public class reversealphatreeset {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeSet<String> ts = new TreeSet<String>(new MYCOMPARE2());
		
		ts.add("ASAD");
		ts.add("TAP");
		ts.add("SHIRSHAK");
		ts.add("PRATEEK");
		ts.add("shirshak");
		ts.add("BTM");
		ts.add("btm");
		System.out.println(ts);

	}

}
