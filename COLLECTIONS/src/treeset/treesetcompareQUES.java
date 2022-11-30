//WAP to store the elements i a treeset base on their length, if their lengths are equal
// it should be sorted based on alphabetic order
package treeset;

import java.util.TreeSet;
import java.util.Comparator;
class MYCOMPARE4 implements Comparator {
	@Override
	public int compare(Object o1, Object o2) {
		
		
		String i1= (String)o1;
		String i2= (String)o2;
		int len1=i1.length();// or we could save this in Integer type obeject as well so that we can use compareTo instead of -
		int len2=i2.length();
		if(len1!=len2) {
			return len1-len2;
		}
		else
			return ((String)o1).compareTo((String)o2);
	}
}


public class treesetcompareQUES {
	public static void main(String[] args) {
		
		TreeSet<String> ts = new TreeSet<String>(new MYCOMPARE4());
		
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
