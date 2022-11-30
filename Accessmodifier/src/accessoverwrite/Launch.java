package accessoverwrite;
class Plane {
	
}
class CargoPlane extends Plane{
	
}
class Parent{
	
	
	public Plane fun() {
		System.out.println("inside parent method");
		 Plane p=new Plane();
		 return p;
	}
}
class Child extends Parent{
	/*  void fun() {*/// here we have decreased the  access 
	/*public int fun() {*/// this is called as signature of method
		public CargoPlane fun() {// this is called as signature of method// here cargoplane and plane has IS-A relationship 
		System.out.println("inside parent method");
		
		CargoPlane cp=new CargoPlane();
		return cp;
		
		/*return 0;*/
	}
}
public class Launch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

	}

}
 
/*  rule of access modifiers*/
//1. whenever child class  is using parents  method(overriding method) it should always main or increse the access specifer never decrese the specifier
//2. signature of the child overridden method should have same return type as parent
//3. signature will allow to have a different return type only when return type has to have a relationship
// as here we have IS-A relationship(THIS TYPE OF RELATION SHIP IN RETURN TYPE IS CALLED AS COVARIANT RELATION)
//between return type if there is a relation then while overwritting the method we can change the return type of the overridden method