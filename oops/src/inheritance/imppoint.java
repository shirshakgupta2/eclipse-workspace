package inheritance;
class Grandparent{
	int x=999;
}
abstract class Parent extends Grandparent{
	int x=9;
	abstract void disp();
}
class Child extends Parent{
	public static int  x=99;
//	 void disp() {
//		System.out.println(x);/*here super will  go one level up only*/
//		System.out.println(super.x);// parent is a super class so super keyword help 
//		                           //to access parents class
//	
//	}
	@Override
	void disp() {
		// TODO Auto-generated method stub
		System.out.println(x);/*here super will  go one level up only*/
		System.out.println(super.x);// parent is a super class so super keyword help 
		                           //to access parents class
	
	}  
}


public class imppoint {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Parent c=new Child();
		c.disp();

	}

}
