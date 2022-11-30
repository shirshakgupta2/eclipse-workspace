package INTERFACE;
interface CALCULATOR{
	void add(int a,int b);// this method by default becomes abstract since the class is interface
	void sub(int a,int b);// this method by default becomes abstract since the class is interface
}
interface CALCULATOR1{
    void mul(int a,int b);// this method by default becomes abstract since the class is interface
	void div(int a,int b);// this method by default becomes abstract since the class is interface
	//int add();//              // we can not over load a method where we have diffrent return type
}
class MYCALCULATOR implements CALCULATOR,CALCULATOR1 // implementing of two classes is possible at same time becoz diamond problem doenst occur
// but over ridding is allowed
{

	@Override
	public void  mul(int a, int b) {
		// TODO Auto-generated method stub
		System.out.println(a*b);
	}

	@Override
	public void div(int a, int b) {
		// TODO Auto-generated method stub
		
		System.out.println(a/b);
	}

	@Override
	public void add(int a, int b) {
		// TODO Auto-generated method stub
		System.out.println(a+b);
		
	}

	@Override
	public void sub(int a, int b) {
		// TODO Auto-generated method stub
		System.out.println(a-b);
		
	}
	
}
public class CALCU2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 MYCALCULATOR MYCALCULATOR= new MYCALCULATOR();
		/*CALCULATOR MYCALCULATOR1= new MYCALCULATOR();*/  // CALCULATOR class does not contain div amd mul so it will so an error for div 
		 // thats why we can not create the object of parent type refrence
		MYCALCULATOR.add(2,5);
		MYCALCULATOR.sub(5, 3);
		MYCALCULATOR.div(9, 3);
		MYCALCULATOR.mul(5, 2);

	}

}
