package ARRAYDEQUEUE;

import java.util.ArrayDeque;

public class arraydequeue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayDeque ad =new ArrayDeque();
		// this is double ended queue
//		ad.add(10);
//		ad.add(20);ad.add(30);ad.add(40);
//		ad.add(50);
//		System.out.println(ad);
		ad.push(10);
		ad.push(20);
		ad.push(30);
		ad.push(40);
		System.out.println(ad);
		
		
		ad.pop();
		System.out.println(ad);
//		System.out.println(ad.pollFirst());
//		System.out.println(ad.pollFirst());
//		System.out.println(ad.pollFirst());
//		System.out.println(ad.pollLast());
		
		for(Object i:ad) {
			System.out.println(i);
		}
		System.out.println();

	}

}