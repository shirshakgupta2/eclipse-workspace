
package inheritance;

class Plane5{
	void takeOff() {
		System.out.println("plane is taking off");
	}
	void fly() {
		System.out.println("plane is flying");
	}
	void land() {
		System.out.println("plane is landing");
	}
}
class cargoplane32 extends Plane5{//cargo class inherits plane class methods variables and blocks
	void fly() {
		System.out.println("cargo is flying at low heights");
	}
	void carryCargo() {
		System.out.println("cargo pane is carrying cargo");
	}
}
class passengerplane32 extends Plane5{
	void fly() {
		System.out.println("passenger plane at medium altitude");
	}
	void carryPassenger() {
		System.out.println("carrying Passenger");
	}
}
class fighterplane32 extends Plane5{
	void fly() {
		System.out.println("fighter plane at high altitude");
	}
	void carrytroops() {
		System.out.println("carrying troops");
	}
}
class plane43 {
	public static void main(String[] args) {
		
		cargoplane32 cp=new cargoplane32();
		passengerplane32 pp=new passengerplane32();
		fighterplane32 fp=new fighterplane32();
		
		cp.takeOff();
		cp.fly();
		cp.land();
		cp.carryCargo();
		
		pp.takeOff();
		pp.fly();
		pp.land();
		pp.carryPassenger();
		
		fp.takeOff();
		fp.fly();
		fp.land();
		fp.carrytroops();
		

	}

}
