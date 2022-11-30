import java.util.Iterator;
import java.util.Scanner;

class Stall implements Runnable{
	private String stallName;
	private String details;
	private double stallArea;
	private double stallCost;
	private String owner;
	
	public Stall() {
	}

	public Stall(String stallName,String details,double stallArea,String owner) {
		this.stallArea=stallArea;
		this.details=details;
		this.owner=owner;
		this.stallName=stallName;
	}

	public String getStallName() {
		return stallName;
	}

	public String getDetails() {
		return details;
	}

	public double getStallArea() {
		return stallArea;
	}

	public double getStallCost() {
		return stallCost;
	}

	public String getOwner() {
		return owner;
	}
	@Override
	public void run() {
		stallCost=stallArea*150;
		//super.run();
	}
	
}
public class stallexibition  {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the number of stalls");
		int n=scan.nextInt();
		scan.nextLine();
		Stall[] stalls=new Stall[n];
		for (int i = 0; i < n; i++) {
			String s=scan.nextLine();
			String[] split = s.split(",");
			stalls[i] =new Stall(split[0],split[1],Integer.parseInt(split[2]),split[3]);
		}
		for (int i = 0; i < n; i++) {
			Thread t = new Thread(stalls[i]);
			t.start();
			try {
				t.join();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		double totalCost=0.0;
		for (int i = 0; i < n; i++) {
			totalCost+=stalls[i].getStallCost();
		}
		System.out.println(totalCost);

	}

}
