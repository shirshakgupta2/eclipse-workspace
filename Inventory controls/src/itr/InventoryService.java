package itr;

import java.util.ArrayList;
import java.util.Scanner;

 class Part{
	private int part_number;
	private double cost;
	public Part(int part_number, double cost) {
		this.part_number = part_number;
		this.cost = cost;
	}
	public Part() {
	}
	public int getPart_number() {
		return part_number;
	}
	public void setPart_number(int part_number) {
		this.part_number = part_number;
	}
	public double getCost() {
		return cost;
	}
	public void setCost(int cost) {
		this.cost = cost;
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return part_number+" "+cost;
	}
}
 class Shelf{
	 Part part=new Part();
	 Part part1=new Part(1,10.50);
	 Part part2=new Part(2,12.50);
	Part part3=new Part(3,11.50);
	Part part4=new Part(4,13.50);
	Part part5=new Part(5,21.50);
	Part part6=new Part(6,9.50);
	private int shelf_id;
	private int shelf_volume;
	public Shelf() {
	}
	public Shelf(int shelf_id, int shelf_volume) {
		this.shelf_id = shelf_id;
		this.shelf_volume = shelf_volume;
		
	}
	
	public int getShelf_id() {
		return shelf_id;
	}

	public void setShelf_id(int shelf_id) {
		this.shelf_id = shelf_id;
	}

	public int getShelf_volume() {
		return shelf_volume;
	}


	public void setShelf_volume(int shelf_volume) {
		this.shelf_volume = shelf_volume;
	}

	public Part getPart() {
		return part;
	}

	public void setPart(Part part) {
		this.part = part;
	}
	ArrayList<Part> al1=new ArrayList<Part>();
	//ArrayList<Part> al2=new ArrayList<Part>();
	{
		
		al1.add(part);
		al1.add(part1);
		al1.add(part2);
		//al1.add(part);
		al1.add(part3);
		al1.add(part4);
		al1.add(part5);
		al1.add(part6);
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return this.shelf_id +" "+this.shelf_volume;
	}

	
	
	

}
class StoreRoom{
	//shelf1.setShelf_id(1);
	Shelf shelf=new Shelf();
	Shelf shelf1 =new Shelf(1,200);
	Shelf shelf2=new Shelf(2,100);
	
	private int Store_id;
	private int Store_Area;
	public StoreRoom( int store_id, int store_Area) {
		Store_id = store_id;
		Store_Area = store_Area;
	}
	public Shelf getShelf() {
		return shelf;
	}
	public void setShelf(Shelf shelf) {
		this.shelf = shelf;
	}
	public int getStore_id() {
		return Store_id;
	}
	public void setStore_id(int store_id) {
		Store_id = store_id;
	}
	public int getStore_Area() {
		return Store_Area;
	}
	public StoreRoom() {
	}
	public void setStore_Area(int store_Area) {
		Store_Area = store_Area;
	}
	 ArrayList<Shelf> al=new ArrayList<Shelf>();
	
	 
	{	al.add(shelf);
		al.add(shelf1);
		al.add(shelf2);
		
		shelf1.setPart(al.get(1).part1);
		shelf1.setPart(shelf1.part2);
		
		shelf2.setPart(shelf2.part3);
		shelf2.setPart(shelf2.part4);
		shelf2.setPart(shelf2.part5);
		shelf2.setPart(shelf2.part6);
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return Store_id+" "+Store_Area;
	}
	
}
class Inventory_test{
	
	
	static ArrayList<StoreRoom> al3=new ArrayList<StoreRoom>();
	StoreRoom storeroom=new StoreRoom(1,100);
	{
		
		al3.add(storeroom);
		
	}
	
	
	
	public void getInventoryLocationByPartNumber(int part_number) {
		for(int i=1;i<=6;i++) {
			System.out.println(storeroom.al.get(i));//+" "+storeroom.al.get(1).getShelf_id());
			
//				if(storeroom.al.get(1).al1.get(i).getPart_number()==part_number) {
//					return "ShelfId="+(storeroom.al.get(1).getShelf_id())+" and "+"store Id"+storeroom.getStore_id();
//					//return("yes1");
//					
//					
//					
//				}
//				else if(storeroom.al.get(2).al1.get(i).getPart_number()==part_number){
//					return "ShelfId="+(storeroom.al.get(2).getShelf_id())+" and "+"store Id"+storeroom.getStore_id();
//					//return("yes2");
//				}
//				
//			
//		}
//		return "Part no. not present";
//		
		}	
	}
	
	
	
}

public class InventoryService {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		int n=scan.nextInt();
		Inventory_test it=new Inventory_test();
		//System.out.println(it.getInventoryLocationByPartNumber(n));
		it.getInventoryLocationByPartNumber(n);
		//System.out.println(it.getNumberOdPartsGreaterThanAvgPartPrice());

	}

}
