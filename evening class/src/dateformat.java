import java.util.Scanner;

public class dateformat {
	static void vailddate(String s) {
		String []a=s.split("/");
		int dd=Integer.parseInt(a[0]);
		int mm=Integer.parseInt(a[1]);
		int yy=Integer.parseInt(a[2]);
		int []mon= {0,31,28,31,30,31,30,31,31,30,31,30,31};
		if((dd>0&&dd<=mon[mm])&&(mm>0&&mm<=12)) {
			System.out.println("valid input");
		}
		else {
			System.out.println("invalid input");
		}
	}
	
	static void daterange(String s,String s1,String s2) {
		String []a=s.split("/");
		String []ar1=s1.split("/");
		String []ar2=s2.split("/");
		int dd=Integer.parseInt(a[0]);
		int dd1=Integer.parseInt(ar1[0]);
		int dd2=Integer.parseInt(ar2[0]);
		int mm=Integer.parseInt(a[1]);
		int mm1=Integer.parseInt(ar1[1]);
		int mm2=Integer.parseInt(ar2[1]);
		int yy=Integer.parseInt(a[2]);
		int yy1=Integer.parseInt(ar1[2]);
		int yy2=Integer.parseInt(ar2[2]);
		int []mon= {0,31,28,31,30,31,30,31,31,30,31,30,31};
		if((dd>0&&dd<=mon[mm])&&(mm>0&&mm<=12)) {
		if(yy>=yy1&&yy<=yy2) {
			//System.out.println("valid input");
			if((mm>=mm1&&mm<=mm2)&&(dd>=dd1)&&dd<=dd2) {
				System.out.println("yes");
			}
			else {
				System.out.println("no");
			}
		}
		else {
			System.out.println("invalid input");
		}
		}
	}
	public static void main (String []args) {
		Scanner scan=new Scanner(System.in);
		
		String s=scan.next();
		System.out.println("enter the range ");
		System.out.println("enter first date");
		String s1=scan.next();
		System.out.println("enter secound date");
		String s2=scan.next();
		
		vailddate(s);
		daterange( s,s1,s2);
	}

}
