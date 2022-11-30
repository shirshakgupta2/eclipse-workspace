package aggregationandcomposition;
class Charger {//agrregation
	private String brand;
	private float voltage;
	
	public Charger(String brand, float voltage) {
		super();
		this.brand = brand;
		this.voltage = voltage;
	}

	public String getBrand() {
		return brand;
	}

	public float getVoltage() {
		return voltage;
	}
}
class OS{// composition
	private String name;
	private int size;
	public OS(String name, int size) {
		super();
		this.name = name;
		this.size = size;
	}
	public String getName() {
		return name;
	}
	public int getSize() {
		return size;
	}
}
class Mobile2{
	OS os =new OS("android",1024);// this is aggregation  // when i am creating object then i will be calling constructor of mobile class
	//just like instance variable which is directly created inside the class not inside any variable
	//here we create composition object  directly inside the main object(Mobile)
	
	/*so what happens here is when ever we create a mobile object java automatically creates the OS object within
	 * therefore mobile object will enclose the OS object*/
	
	void hasACharger(Charger c) {
		//to implement a aggregation we create a method named hasACharger
		System.out.println(c.getBrand());
		System.out.println(c.getVoltage());
	}
	 
}
public class Mobile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Charger c=new Charger("smasung",14.5f);
		Mobile2 m=new Mobile2(); 
		System.out.println(m.os.getName());
		System.out.println(m.os.getSize());

		/*System.out.println(os.getName);*///  this is showing error becoz 
		                             //it can not find os without going inside mobile
		m.hasACharger(c);
		m=null;// if mobile is lost then there is no refrence to os
		/*System.out.println(m.os.getName());
		System.out.println(m.os.getSize());*/   // this will show null pointer exception 
		/*m.hasA(c);  */        //java.lang.NullPointerException: 
		System.out.println(c.getBrand());
		System.out.println(c.getVoltage());
	}

}

/*
 * first create a supporting objects and then create a main object becoz main object can require a supporting object
 *  OS object should only be created if mobile object is their since OS is composition that means os object is inside mobile object
 *  if mobile object is distroyed then OS object should automatically be destroyed
 *  
 * */
