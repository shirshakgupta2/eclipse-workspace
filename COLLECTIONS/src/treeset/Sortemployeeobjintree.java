// wap store employee in treeset and sort it by name if same salary if same id

package treeset;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.TreeSet;



class Employee1 implements Comparable{
	private int id;
	private String name;
	private long salary;
	
	public Employee1() {
	}
	public Employee1(int id, String name, long salary) {
		this.id = id;
		this.name = name;
		this.salary = salary;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public long getSalary() {
		return salary;
	}
	public void setSalary(long salary) {
		this.salary = salary;
	}
	
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return this.id+" "+this.name+" "+this.salary;
	}
	@Override
	public int compareTo(Object o) {
		//compareTo only gives in ascending order but if we want in descending order 
		//then we implement comparator and use compare method which expects two Object parameter
		
		// TODO Auto-generated method stub
		Employee1 o1=this;
		Employee1 o2=(Employee1) o;
		
		
		 if(o1.salary!=o2.salary) {
			long i1=o1.salary;
			long i2=o2.salary;
			return (int)(i1-i2);
		}
		 else if(o1.name!=o2.name){
			 return o1.name.compareTo(o2.name);
		 }
		 else if(this.id!=o2.id) {
			 return id-o2.id;
		 }
		 
		
		return 0;
	}
}
public class Sortemployeeobjintree {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee1 e1 = new Employee1(1,"alex",100000);
		Employee1 e2 = new Employee1(2,"tom",20000);
		Employee1 e5 = new Employee1(5,"bob",10000);
		Employee1 e3 = new Employee1(3,"fox",130000);
		Employee1 e7 = new Employee1(1,"fox",130000);
		Employee1 e4 = new Employee1(4,"shirshak",1300000);
		
		ArrayList<Employee1> ts=new ArrayList<Employee1>();
		ts.add(e1);
		ts.add(e2);
		ts.add(e3);
		ts.add(e4);
		ts.add(e5);
		ts.add(e7);
		System.out.println(ts);
		for (Employee1 employee : ts) {
			System.out.println(employee);
		}
		
		System.out.println();
		// only required when list is there if any set is there then it isn't required
		Collections.sort(ts);
		for (Employee1 employee : ts) {
			System.out.println(employee);
		}
		

	}

}
