package LISKOsubstitution;

import java.sql.SQLException;

class test{
	public void fun() throws ArithmeticException
	{
		System.out.println("inside parent class fun()");
		
	}
}
class test2 extends test
{
	public void fun() throws ArithmeticException  // it can be any of runtime exception or its not compulsory to throw an exception
	{
		System.out.println("inside chaild class fun()");
	}
	// inherited class when parent is throwing an exception then child class can throw same exception or can have same runtime exception 
	//or can have no exception
	
}
class test3 
{
	public void fun2 () throws SQLException
	{
		System.out.println("inside parant IOexception");
	}
}

class test4 extends test3
{
	public void fun2 () throws SQLException// if parent throws an IOException then it has to have same IOEception or can only change to runtime exception 
	{
		System.out.println("insid3e child IOexception");
	}
}

class test5 extends test3
{
	public void fun2 () throws ArithmeticException
	{
		System.out.println("inside child IOexception to runtime Exception");
	}
}

public class test1 {
	public static void main(String []args) {
		test t=new test2();
		t.fun();
	}

}
