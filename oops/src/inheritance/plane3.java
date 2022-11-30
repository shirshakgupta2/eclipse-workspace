package inheritance;
class plane4{
	void takeOff() {
		//System.out.println("plane is taking off");
	}
	void fly() {
		//System.out.println("plane is flying");
	}
	void land() {
		//System.out.println("plane is landing");
	}
}
class cargoplane4 extends plane4{
	void takeOff() {
		System.out.println("plane is taking off long runway");
	}
	void fly() {
		System.out.println("plane is flying in low highet");
	}
	void land() {
		System.out.println("plane is landing long runway");
	}
	void pn() {
		System.out.println("helllo");
	}
}
class passengerplane4 extends plane4{
	void takeOff() {
		System.out.println("plane is taking off medium runway");
	}
	void fly() {
		System.out.println("plane is flying in medium highet");
	}
	void land() {
		System.out.println("plane is landing medium runway");
	}
}
class fighterplane4 extends plane4{
	void takeOff() {
		System.out.println("plane is taking off short runway");
	}
	void fly() {
		System.out.println("plane is flying in high highet");
	}
	void land() {
		System.out.println("plane is landing short runway");
	}
}
 class Airport{
	static void permit(plane4 ref){
		 ref.takeOff();
		 ref.fly();       // loose coupling happen through this
	   	ref.land();
	   
	 }
 }
public class plane3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		cargoplane4 cp=new cargoplane4();
		passengerplane4 pp=new passengerplane4();   //these all are tight coupling so polymorphism is not achived
		fighterplane4 fp=new fighterplane4();
		
		
		Airport.permit(cp);
		cp.pn();
		Airport.permit(pp);
		Airport.permit(fp);
		
		/*plane4 ref;
		ref=cp;
		ref.takeOff();
		ref.fly();       // loose coupling happen through this
		ref.land();
		//cp.carryCargo();
		
		pp.takeOff();
		pp.fly();
		pp.land();
		//pp.carryPassenger();
		
		fp.takeOff();
		fp.fly();
		fp.land();
		//fp.carrytroops();*/

	}

}
