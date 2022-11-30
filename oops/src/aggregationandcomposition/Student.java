package aggregationandcomposition;
class  Brain{// composition
	private int weight;
	private String colour;
	public Brain(int weight, String colour) {
		super();
		this.weight = weight;
		this.colour = colour;
	}
	public int getWeight() {
		return weight;
	}
	public String getColour() {
		return colour;
	}
}
class Heart{// composition
	private int weight;
	private int bpm;
	public int getWeight() {
		return weight;
	}
	public int getBpm() {
		return bpm;
	}
	public Heart(int weight, int bpm) {
		super();
		this.weight = weight;
		this.bpm = bpm;
	}
}
class Bike{// agrregration
	private int mileage;
	private String brand;
	public Bike(int mileage, String brand) {
		super();
		this.mileage = mileage;
		this.brand = brand;
	}
	public int getMileage() {
		return mileage;
	}
	public String getBrand() {
		return brand;
	}
} 
class Book{ // agrregration
	private String name;
	private String author;
	public Book(String name, String author) {
		super();
		this.name = name;
		this.author = author;
	}
	public String getName() {
		return name;
	}
	public String getAuthor() {
		return author;
	}
}
class student23{
	Heart h=new Heart(160,72);  // since it is tight bond or composition we create an object of that class to access the variable and methods inside it 
	Brain b=new Brain(140,"grey");
	void hasA(Bike b) {
		System.out.println(b.getBrand());
		System.out.println(b.getMileage());
	}
	//@method overloading  with same name and diff parameters
	void hasA(Book bo){
		System.out.println(bo.getAuthor());
		System.out.println(bo.getName());
	}
	 
}
public class Student {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Bike b =new Bike(20,"ktm");
		Book bo=new Book("biography shirshak","yuvraj patil");
		 student23 s = new student23();
		 System.out.println(s.h.getWeight());
		// System.out.println(h.getWeight());will not work until you go inside student object
		 System.out.println(s.h.getBpm());
		 System.out.println(s.b.getWeight());
		 System.out.println(s.h.getBpm());
		 s.hasA(b);
		 s.hasA(bo);
		 s=null;
		 System.out.println(b.getBrand());
		 System.out.println(b.getMileage());
		 System.out.println(bo.getAuthor());
		 System.out.println(bo.getName());

	}

}
