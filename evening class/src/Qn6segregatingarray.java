import java.util.Scanner;

public class Qn6segregatingarray {
	static void segregate01arrayminswap(int a[]) {
		int count =a.length-1;
		int swap=0;
		int i=0;
			while(i<count) {
				if(i!=0) {
			if(a[i]==1&&a[count]==0) {
				swap=a[i];
				a[i]=a[count];
				a[count]=swap;
				count--;
			}else if(a[count]==1||a[i]==1) {
				count--;
			}}
			i++;
		}
		for( i=0;i<a.length;i++) {
			System.out.println(a[i]);
		}

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan =new Scanner(System.in);
		int n=scan.nextInt();
		int a[]=new int[n];
		for(int i=0;i<a.length;i++) {
			a[i]=scan.nextInt();
		}
		segregate01arrayminswap(a);

	}

}
