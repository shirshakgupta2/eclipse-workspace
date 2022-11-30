package array;
import java.util.*;
public class arraycombine {
	static void arrayCombine(int a[],int b[],int m,int n  ) {
		int res[]=new int[m+n];
		int i=0,j=0,k=0;
		while(i<a.length&&j<b.length) {
			if(a[i]<b[j]) {
     		res[k++]=a[i++];
			//i++;k++;
		 }
			else {
			res[k++]=b[j++];
			//j++;k++;
		}
		}
		
		while(i<a.length) {
		//	res[k]=a[i];
			res[k++]=a[i++];
			//i++;k++;
		}while(j<b.length) {
			res[k]=b[j];
			j++;k++;
		}
		for( i=0;i<res.length;i++) {
		System.out.print(res[i]+" ");}
	}

   public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		int n=scan.nextInt();
		int a[]=new int[n];
		for(int i=0;i<a.length;i++) {
			a[i]=scan.nextInt();
		}
		int m=scan.nextInt();
		int b[]=new int[m];
		for(int i=0;i<b.length;i++) {
			b[i]=scan.nextInt();
		}
		arrayCombine( a,b, m, n  );
		

	}

}
