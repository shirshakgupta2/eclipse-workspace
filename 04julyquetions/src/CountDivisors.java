import java.util.Scanner;

public class CountDivisors {
	static int divisors(int l,int r,int k) 
	{		int count=0;

	
		for(int i=l;i<=r;i++)
		{
			if(i%k==0) {
				
				/*System.out.println(i);*/
			count++;
			
			}
		}
		return count;
	}
	public static void main(String[] args) {
		
		Scanner scan=new Scanner(System.in);
		System.out.println("enter l");
		int l=scan.nextInt();
		System.out.println("enter r");
		int r=scan.nextInt();
		System.out.println("enter k");
		int k=scan.nextInt();
		divisors( l, r, k) ;//Dont make a mistake of putting int here also//
		/*System.out.println("no.s that are divided by k");
		/*for(int i=l;i<=r;i++)
		{
			if(i%k==0) {
				
				System.out.println(i);
			count++;
			
			}
		}*/
		int a=divisors(l,r,k);
	System.out.println("Count of the no. of divisors are");
	System.out.println(a);
	/*Or we can do
	 * System.out.println(divisors(l,r,k));
	 */
	
	}
}