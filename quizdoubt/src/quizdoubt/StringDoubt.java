package quizdoubt;

public class StringDoubt {
	public static void main(String args[]) {
    String obj="i"+"like"+"you";
    String s1=new String("java");
    String s2=new String("javac");
    System.out.println(obj);
    System.out.println("obj"+10+5);
    System.out.println(s1=s2);// s2 is assign to s1 
    // so s1 will have the adress of s2 now so the refrence fror s1 will become same as s2
	String s3="hello";
	String s4="World";
	s4=s3;
	s4="World";
	System.out.println(s3+" "+s4);
	System.out.println();
	byte ar[]= {97,98,99,100,101};
	String str=new String(ar);
	System.out.println(str);
	
	}
	}                            
