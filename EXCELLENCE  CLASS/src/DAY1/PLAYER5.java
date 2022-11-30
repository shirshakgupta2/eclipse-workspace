package DAY1;

import java.util.Scanner;

class Player{
	private String name;
	private int age;
	private String country;
	public Player() {
	}
	
	public Player(String name, int age, String country) {
		this.name = name;
		this.age = age;
		this.country = country;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}
	 
	@Override
	public String toString() {
		return "Name:"+this.name+" Age:"+this.age+" Country:"+country;
	}
	
}
public class PLAYER5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan =new Scanner(System.in);
		System.out.println("Enter  name");
		String name=scan.next();
		System.out.println("Enter  age");
		int age=scan.nextInt();
		System.out.println("Enter  country");
		String country=scan.next();
		
		Player player = new Player(name,age,country);
		System.out.println(player);

	}

}
