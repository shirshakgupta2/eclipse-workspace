package inheritance;
class plane29{
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
class cargoPlane extends plane29{//cargo class inherits plane class methods variables and blocks
	void takeOff() {
		System.out.println("cargoplane is taking off long runway");
	}
	void fly() {
		System.out.println("cargo is flying at low heights");
	}
	void carryCargo() {
		System.out.println("cargo pane is carrying cargo");
	}
}
class passengerPlane extends plane29{
	void fly() {
		System.out.println("passenger plane at medium altitude");
	}
	void carryPassenger() {
		System.out.println("carrying Passenger");
	}
}
class fighterPlane extends plane29{
	void fly() {
		System.out.println("fighter plane at high altitude");
	}
	void carrytroops() {
		System.out.println("carrying troops");
	}
}
class AIrpot{
	static void permit(plane29 ref) {
		ref.takeOff();
		ref.fly();
		ref.land();
		
	}
}
public class Luanch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		cargoPlane cp=new cargoPlane();
		passengerPlane pp=new passengerPlane();   // these all are tight coupling so polymorphism is not achived
		fighterPlane fp=new fighterPlane();
		AIrpot.permit(cp);
		AIrpot.permit(pp);
		AIrpot.permit(fp);
	

	}

}
