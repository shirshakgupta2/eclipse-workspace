package hackerRank;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.TreeSet;

public class QuickSort1Partition {
	static List<Integer> quickSort(List<Integer> arr){
		TreeSet<Integer> ts=new TreeSet<Integer>(arr);
		ArrayList<Integer> a=new ArrayList<Integer>(ts);
        return a;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan= new Scanner(System.in);
		int n =scan.nextInt();
		
		ArrayList<Integer> arr=new ArrayList<Integer>(n);
		for (int i = 0; i < n; i++) {
			arr.add(scan.nextInt());
		}
		System.out.println(quickSort(arr));
		

	}

}
