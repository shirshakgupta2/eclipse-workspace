package package3;

import package1.test1;

public class Test4 {
	void display() {
		test1 t1=new test1();
		System.out.println(t1.a);// it was public so after import we can access
		
		System.out.println(t1.b);
		System.out.println(t1.c); // default members are  not accessable in difrent class even after inheritance
		System.out.println(t1.d);
	}

}
