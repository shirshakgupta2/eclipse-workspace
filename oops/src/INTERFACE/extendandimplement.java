package INTERFACE;
 class power{
	 int power2(int a) {
		 return a*a;
	 }
}
interface caluo1{
	void add();
	void sub();
}
interface caluo2{
	void mul();
	void div();
}


class MYCALUO extends power implements caluo1,caluo2{// order of this should be maintained 
	//first extends and implements later

	@Override
	public void mul() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void div() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void add() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void sub() {
		// TODO Auto-generated method stub
		
	}
	
}
public class extendandimplement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MYCALUO MYCALUO=new MYCALUO();
		MYCALUO.add();
		MYCALUO.div();
		MYCALUO.mul();MYCALUO.sub();
		System.out.println(MYCALUO.power2(2));

	}

}
/*
 * class can extend a class and implement a interface
 * interface can extend interface */


