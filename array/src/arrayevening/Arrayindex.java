package arrayevening;
import java.util.*;
public class Arrayindex {
static int search(int []a,int n) {
 for(int i=0;i<=a.length-1;i++) {
			if(a[i]==n) {
				return i;}
		}
 return -1;
 }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		int k=scan.nextInt();
		int a[]=new int[k];
		
		int n=scan.nextInt();
		for(int i=0;i<=a.length-1;i++) {
			a[i]=scan.nextInt();
		}
		System.out.println(search(a,n));
		/*for(int i=0;i<=a.length-1;i++) {
			if(a[i]==n) {
				System.out.println(i);break;
			}
		}*/
		

	}

}
