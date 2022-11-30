package ARRAYLIST;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;



class Employee {
	private int id;
	private String name;
	private  long salary;
	
	public Employee() {
	}
	public Employee(int id, String name, long salary) {
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
	
}

	class MYCOMPARE1 implements Comparator {
		@Override
		public int compare(Object O1, Object O2) {
			Employee o1=(Employee)O1;
			Employee o2=(Employee)O2;
			
			if(o1.getSalary()!=o2.getSalary()) {
				long i1=o1.getSalary();
				long i2=o2.getSalary();
				return (int)(i1-i2);
			}
			else if(o1.getName()!=o2.getName()) {
				return (o1.getName().compareTo(o2.getName()));
			}
			else if(o1.getId()!=o2.getId()) 
			{
				int i1=o1.getId();
				int i2=o2.getId();
				return i1-i2;
			}
			
			return 0;
			
					
		}
	}

 
//class MYCOMPARE implements Comparable{
//	@Override
//	public int compareTo(Object o) {
//		// TODO Auto-generated method stub
//		Employee o1=(Employee) o;
//		Employee o2=(Employee) o;
//		
//		
//		
//		
//	}	
//	
//}

public class employeeinarray {
	public static void main(String[] args) {
		Employee e1 = new Employee(1,"alex",100000);
		Employee e2 = new Employee(2,"tom",20000);
		Employee e3 = new Employee(3,"fox",130000);
		Employee e4 = new Employee(4,"selena",10000);
		Employee e5 = new Employee(5,"shirshak",135000);
		Employee e6 = new Employee(4,"shirshak",135000);
		
		ArrayList<Employee> al=new ArrayList<Employee>();
		al.add(e1);
		al.add(e2);
		al.add(e3);
		al.add(e4);
		al.add(e5);
		al.add(e6);
		//System.out.println(al);
		for (Employee employee : al) {
			System.out.println(employee);
		}
		System.out.println();
		System.out.println();
		System.out.println();
		MYCOMPARE1 mycompare = new MYCOMPARE1();
		Collections.sort(al,mycompare);
		for (Employee employee : al) {
			System.out.println(employee);
		}
	}


}


































