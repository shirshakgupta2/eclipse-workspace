package PriorityQueue;

import java.util.PriorityQueue;

public class priorityqueuedatastore {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PriorityQueue pq = new PriorityQueue();
		pq.add(120);
		pq.add(60);
		pq.add(160);
		pq.add(30);
		pq.add(80);
		pq.add(140);
		pq.add(180);
		System.out.println(pq);
		//pq.remove(30);
		//System.out.println(pq);
		
		for(Object i:pq) {
			System.out.println(i);
		}
		System.out.println();

	}

}
