package itr;

import java.util.ArrayList;
import java.util.Scanner;

class Part1{
	private int part_number;
	private double cost;
	public Part1() {
		
	}
	public Part1(int part_number, double cost) {
		this.part_number = part_number;
		this.cost = cost;
	}
	public int getPart_number() {
		return part_number;
	}
	public double getCost() {
		return cost;
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return part_number+" "+cost;
	}
}
class Shelf1{
	
	private int shelf_id;
	private int shelf_volume;
	ArrayList<Part1> part=new ArrayList<Part1>();
	
	public Shelf1() {
		
	}
	public Shelf1(ArrayList<Part1> part, int shelf_id, int shelf_volume) {
		this.part = part;
		this.shelf_id = shelf_id;
		this.shelf_volume = shelf_volume;
	}
	
	public ArrayList<Part1> getPart() {
		return part;
	}

	public void setPart(ArrayList<Part1> part) {
		this.part = part;
	}


	public int getShelf_id() {
		return shelf_id;
	}
	public int getShelf_volume() {
		return shelf_volume;
	}
	
	{
		
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return shelf_id+" "+shelf_volume;
	}
	
	
	
}
class StoreRoom1{

	private int Store_id;
	private int Store_Area;
	ArrayList<Shelf1> shelf=new ArrayList<Shelf1>();
	public StoreRoom1() {
	}
	
	public StoreRoom1(ArrayList<Shelf1> shelf, int store_id, int store_Area) {
		this.shelf = shelf;
		Store_id = store_id;
		Store_Area = store_Area;
	}
	
	public ArrayList<Shelf1> getShelf() {
		return shelf;
	}

	public void setShelf(ArrayList<Shelf1> shelf) {
		this.shelf = shelf;
	}

	public void setStore_id(int store_id) {
		Store_id = store_id;
	}

	public void setStore_Area(int store_Area) {
		Store_Area = store_Area;
	}

	public int getStore_id() {
		return Store_id;
	}
	public int getStore_Area() {
		return Store_Area;
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return Store_id+" "+Store_Area;
	}
}
class inventoryTest1{
	
	static ArrayList<StoreRoom1> al3=new ArrayList<StoreRoom1>();
	
	ArrayList<Part1> al1=new ArrayList<Part1>();
	ArrayList<Part1> al2=new ArrayList<Part1>();
	ArrayList<Shelf1> al=new ArrayList<Shelf1>();
	
	StoreRoom1 sr1=new StoreRoom1(al,1,200);
	{al3.add(sr1);}
	Part1 part1=new Part1(1,10.50);
	Part1 part2=new Part1(2,12.50);
	Part1 part3=new Part1(3,11.50);
	Part1 part4=new Part1(4,13.50);
	Part1 part5=new Part1(5,21.50);
	Part1 part6=new Part1(6,9.50);
	{
		al1.add(part1);
		al1.add(part2);
		al2.add(part3);
		al2.add(part4);
		al2.add(part5);
		al2.add(part6);
	}
	Shelf1 shelf1 =new Shelf1(al1,1,200);
	
	
	Shelf1 shelf2 =new Shelf1(al2,2,100);
	{
		al.add(shelf1);
		al.add(shelf2);
	}
	
	
	public String getInventoryLocationByPartNumber(int part_number) {
		
		int j=0;
		while(sr1.getShelf().size()>0) {
			for(int i=0;i<sr1.getShelf().get(j).part.size();i++) {
				if(sr1.getShelf().get(j).part.get(i).getPart_number()==part_number ) {
					return "SHELF ID: "+sr1.getShelf().get(j).getShelf_id()+" AND STORE ID: "+sr1.getStore_id();
				}
			}
			j++;
		}
		return null;
	}
		
}
public class Inventoryservice1 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		int n=scan.nextInt();
		inventoryTest1 it=new inventoryTest1();
		//it.getInventoryLocationByPartNumber(n);
		System.out.println(it.getInventoryLocationByPartNumber(n));;
		

	}

}
