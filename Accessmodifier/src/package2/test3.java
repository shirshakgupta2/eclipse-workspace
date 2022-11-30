package package2;
import package1.test1;// import is required when we are in diffrent class
public class test3 extends test1
{
	void display() {
		System.out.println(a);
		System.out.println(b);
		System.out.println(c); // default members are  not accessable in difrent class even after inheritance
		System.out.println(d);
	}

}
