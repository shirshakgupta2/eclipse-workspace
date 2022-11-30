package arrayevening;

import java.util.Scanner;

public class FreqOfNum {
	static void frequency(int []a)
	{
		int freq=0;
		Scanner scan=new Scanner(System.in);
		int n=scan.nextInt();
		for (int i = 0; i < a.length; i++) {
			if(a[i]==n) {
				freq++;
			}
		}
		System.out.println(freq);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int n=scan.nextInt();
		int []a=new int [n];
		for (int i = 0; i < a.length; i++) {
			 a[i]=scan.nextInt();
		}
		frequency(a);
	}

}
