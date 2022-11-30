package inheritance;
//final class Plane{ if we use final that means it can not be inherited  any whaer
class Plane{
	  int noOfSeats=100;
	 //final int noOfSeats=100;
	
	//final  void fly() {
	  void fly() {
		System.out.println("plane is flying");
	}
	int changeSeats() {
		noOfSeats=200;
		return noOfSeats;
	}
}
class Cargo24 extends Plane{
	void fly() {
		System.out.println("plane flys at low height");
	}
	
}
public class keywordfinal {
	public static void main (String []args) {
		Cargo24 cp=new Cargo24();
		cp.fly();
		Plane p=new Plane();
		System.out.println(p.changeSeats());
		
	}

}


//1. final keyword is used when you don't want any inheritance to happen at any cost  
// so inheritance no y=to happen of  CLASS 
// 2.final keyword on method can  be used  when you want to  inherit the method but 
//not override(modify) the method
//3. final keyword makes the variable becomes constant and can not be modified