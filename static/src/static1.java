
public class static1 {


	static int a,b;
	
	int Z,A;{// these are instance variable
		System.out.println("inside instance block");
		b=20;//instance block can access static variable
	}
	static {
		// static block can access static variable
		System.out.println("inside static block");
		a=10;// eclipse didn't give any error so it means we can access 
		b=20;// static variable
	   // A=20;// STATIC BLOCK CAN NOT ACCESS TO INSTANCE VARIABLE
	}
	static void fun1() {
		System.out.println("inside static method");
		a=20;// static method can access static variable
	}
	
	int x,y;{// these are instance variable
		System.out.println("inside instance block");
		b=20;//instance block can access static variable
	}
	void fun2() {
		System.out.println("inside instance method");
	}
	// if we dont give constructor java itself gives a default constructor
	public static1() {// this is constructor given by the programmer
		System.out.println("inside constructor");
		x=30;
		y=40;
		
	}
}
class mess{// first demo class is loaded
	// befor execution of main methood of democlass java check if there is any static variable or staic block in demo class
    public static void main(String[] args) {// first class to load is demo class then main is activated
    	
	// as java sees STAITIC.fun1()  this call class loader to load STAITIC class 
    static1.fun1();// static method can be called without object creation
	
	
	static1 s=new static1();// after object is created and before constructor gets called 
	    // java will check if there is any instance block if yess it will execute that first.
	// then after instance block is called constructor is called 
	s.fun2();// instance method can not be called without object creation
	}
}

/*flow chart*/
//1. staticvariable is executes
//2. staticblock is executes
//3. fun() is executes
//4. as java sees new jvm gets activated first jvm will allocate memory for instance variable
//5.after object is created and before constructor gets called  java will check if there is any instance block 
//6. then constructor is called
//7.fun()2 instance method
