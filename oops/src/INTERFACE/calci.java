package INTERFACE;

interface Calcula1{
	int add(int a,int b);//it is by default abstract and public as well since it is 
	void sub(int a,int b);// interface class
	
}
class Calculato1 implements Calcula1// since we are inheriting interface class we dont wirte 
                                 // extends rather we write implements
{
@Override
public int add(int a, int b) {
	// TODO Auto-generated method stub
	return a+b;
}

@Override
public void sub(int a, int b) {
	// TODO Auto-generated method stub
	System.out.println(a-b); 
//return a-b;
}
}


class Calculator2 implements Calcula1{
	@Override
	public int add(int a, int b) {
		// TODO Auto-generated method stub
		return a+b;
	}

	 @Override
	public void sub(int a, int b) {
		// TODO Auto-generated method stub
		System.out.println(a-b); 
	}
	 public void mul(int a, int b) {
		 // TODO Auto-generated method stub
		 System.out.println(a*b); 
	 }
	 
}

class DEMOCALCI{
	static int evalute(Calcula1 cal) {// dont forget to make this staic to directly call the method 
		int c=cal.add(2,4);
			cal.sub(5,3);//this directly prints the a-b value
			
		//  cal.mul(5,3);// this can not be called becoz its an specialized method
		 return c;
		
	}
}
public class calci {

		// TODO Auto-generated method stub
	public static void main(String[] args) {
		Calcula1 calci1=new Calculato1();
		/*Calculator1 calci1=new Calculator1();*/      // both are correct
		Calculator2 calci2=new Calculator2();
		//DEMOCALCI.evalute(calci1);
		System.out.println(DEMOCALCI.evalute(calci1));
		System.out.println(DEMOCALCI.evalute(calci2));
		

	}

}

