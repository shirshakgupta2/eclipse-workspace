

public class CompareTo {
public static void main(String args[]) {
	String s1="SACHIN";
	String s2="SACHIN T";//will give negative value if s2>s1
	String s3="SAURAV";
	String s4="SAurav";
	String s5="Sachin";
	String s6="sachin";
	String s7="java programming";
    System.out.println(s2.compareTo(s1));
	System.out.println(s1.compareTo(s2));
	System.out.println(s1.compareTo(s3));
	System.out.println(s1.concat(s5));
	System.out.println(s1.compareTo(s5));
	System.out.println(s1.compareToIgnoreCase(s5));
	System.out.println(s5.toUpperCase());// new block of memory is created and new string is created 
	System.out.println(s1);// it is not the address that is the output
	System.out.println(s5.indexOf('h'));
	System.out.println();
	System.out.println(s7.indexOf('a'));
	System.out.println();
	System.out.println(s2+s3);
	System.out.println(s1.lastIndexOf('N'));
	/*System.out.println(s1.firstIndexOf('S'));*/    // not a method such as first index of
	System.out.println(s6.startsWith("g"));
	System.out.println(s6.startsWith("s"));  //
	System.out.println(s6.endsWith("in"));
	System.out.println(s4.contains("chon"));
	System.out.println(s6.contains("chin"));
	System.out.println(s6.substring(3));//
	System.out.println(s6.substring(2,5));//  inn this start is including in range but end is excluded maths remeber[2,5) 
}
}
