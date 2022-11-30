import java.util.Scanner;

class Circle{
	private float area;
	private float radius;
	private float PI;
	public void acceptInput() {
		Scanner scan=new Scanner (System.in);
		radius=scan.nextFloat();
		PI=3.14f;
	}
	public void area() {
		area=PI*radius*radius;
	}
	public void displayarea() {
		System.out.println(area);
	}

}


public class circlearea {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Circle c1=new Circle();
		c1.acceptInput();
		c1.area();
		c1.displayarea();
		Circle c2=new Circle();// we have to keep creating objects again and again for multiple calculation
		                       // of area
		c2.acceptInput();
		c2.area();
		c2.displayarea();

	}

}
