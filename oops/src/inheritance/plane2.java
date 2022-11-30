package inheritance;

class Plane1{
	/*void takeOff() {
		System.out.println("plane is taking off");
	}*/
	void fly() {
		System.out.println("plane is flying");
	}/*
	void land() {
		System.out.println("plane is landing");
	}*/
}
class cargo extends Plane1{//cargo inherits plane methods variables and blocks
	void fly() {
		System.out.println("cargo is flying at low heights");
	}
	void carryCargo() {
		System.out.println("cargo pane is carrying cargo");
	}
	
}
class passenger extends Plane1{
	void fly() {
		System.out.println("passenger plane at medium altitude");
	}
	void carryPassenger() {
		System.out.println("carrying Passenger");
	}
	void carrytroops() {
		System.out.println("carrying troops");
	}
	
}
class fighter extends Plane1{
	void fly() {
		System.out.println("fighter plane at high altitude");
	}
	
}
public class plane2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		cargo cp=new cargo();
		passenger pp=new passenger();   // these all are tight coupling so polymorphism is not achived
		fighter fp=new fighter();//
		//cp.takeOff();
		//cp.fly();
		//cp. land();
		//pp.fly();		
		//fp.fly();
		Plane1 ref;
		ref=cp;//parent type refrence can point to child type object
		ref.fly();
		cp.carryCargo();
		//ref.carryCargo();// parent refrence can not be used to have an acces of not inherited method 
		// therefor we have to create an down casting in this where parenet refrence has to be casted to child refrence
		//(((cargo) ref)).carryCargo();
		ref=pp;
		ref.fly();

	}

}

