package aggregationandcomposition;
class Exmp1{
	int i=99;
}
class Exmp2 extends Exmp1{
	int i=9;//here both i's are there 
	void display() {
		System.out.println(i);// but here local i is given the prefrence
		System.out.println(super.i);
	}
}
public class superclass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Exmp2 exmp2 = new Exmp2();
		exmp2.display();

	}

}
