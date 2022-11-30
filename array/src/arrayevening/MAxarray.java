package arrayevening;
import java.util.*;
public class MAxarray {
	static int minInArray(int a[]) {
		int min =a[0];
		int k=0;
		for (int i = 0; i < a.length; i++) {
		    	if(min>a[i]) {
				min=a[i];
			    }
		    }
		    System.out.println(min);
		return 0;
	}
	
	static int maxInArray(int a[]) {
		int max=0;
		for(int i=0;i<a.length;i++) {
			if(a[i]>max) {
				max=a[i];
			}
		}
			return max;
	}
	
	static int secondlargestinarray(int a[]) {
		int max=0,second_max=0;
		if(a[0]>a[1]){
			max=a[0];
			second_max=a[1];
		}
		else {
			max=a[1];
			second_max=a[0];
		}
		for (int i = 2; i < a.length; i++) {
			if(a[i]>max) {
				second_max=max;
				max=a[i];
			}
			else if(a[i]>second_max) {
				second_max=a[i];
			}
		}
		return second_max;
		
	}
	static int secondmininArray(int a[]) {
		int First_min=0,Second_min=0;
		 if(a[0]<a[1]) {
			 a[0]=First_min;
			 a[1]=Second_min;
		 }else {
			 a[1]=First_min;
			 a[0]=Second_min;
		 }
		 for (int i = 2; i < a.length; i++) {
			if(a[i]<First_min) {
				Second_min=First_min;
				First_min=a[i];
			}
			else if(a[i]<Second_min) {
				Second_min=a[i];
			}
		}
		 return Second_min;
	}

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		int n=scan.nextInt();
		int a[] =new int[n];
		for(int i=0;i<a.length;i++) {
			a[i]=scan.nextInt();
		}
		minInArray(a);
		System.out.println(maxInArray(a));
		System.out.println(secondlargestinarray(a));
		System.out.println(secondmininArray(a));
	}

}
