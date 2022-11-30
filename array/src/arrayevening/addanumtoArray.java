package arrayevening;

import java.util.Scanner;

public class addanumtoArray {
	static {
		
	}
	public static void NumConvertToeachNumaddone(){
		Scanner scan = new Scanner(System.in);
		int a=scan.nextInt();
		int number=scan.nextInt();
//		int b=0,c=0;
//		int i=0;
//		while(a>0) {
//			b=a%10;
//			c=c+(c+1);
//			a=a/10;
//			System.out.println(c);
//			
//		}
//		System.out.println(c);
        int add = 1;
        String s=String.valueOf(number);// converts value to a string
        for (int i = 0; i < s.length();i++) {
            number = number + add;
            add = add * 10;
        }
        System.out.println(number);
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int n=scan.nextInt();
		int []a=new int [n];
		int []ar=new int [n];
		int j=0;
		for (int i = 0; i < a.length; i++) {
			 a[i]=scan.nextInt();
		}
		for (int k = 0; k < a.length; k++) {
			ar[k]=++a[k];
		}
		for (int i = 0; i < ar.length; i++) {
			System.out.print(ar[i]);
		}
		NumConvertToeachNumaddone();

	}

}
