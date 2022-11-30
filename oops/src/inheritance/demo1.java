package inheritance;
class rough extends Plane {
	 public int b;
	 private static int c;
	 noOfSeats=200;
	 int a() {
		return 6+2;
	}
	public static int getC() {
		return c;
	}
	public static void setC(int c) {
		rough.c = c;// we can use this.c also but the  
		// setC method should not be static
	}
}
class rough1 extends rough{
	  int a() {
		// rough r2 = new rough();
		 b=10;
		 
		return 7+3;
	}
//	  public static int getC() {
//			return c;
//		}
//		public static void setC(int c) {
//			rough.c = c;// we can use this.c also but the setC method should 
//			// not be static
//		}
}
class rough2 extends rough1{
	
}
public class demo1 {
	public static void main(String[] args) {
		rough1 r1 = new rough1();
		rough.setC(0);
		System.out.println(r1.a());//10
		System.out.println(rough.getC());//0
		rough2 rough2 = new rough2();
		System.out.println(rough2.a());//10
	}

}
