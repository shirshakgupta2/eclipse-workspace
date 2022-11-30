
import java.util.Scanner;
class ChefAndCandies {

	public static void main(String[] args)   {
			Scanner scan= new Scanner(System.in);
				int t=scan.nextInt();
			while(t>0){
			int N=scan.nextInt();
			int X=scan.nextInt();
			int a=N-X;
			if(X>N){
				System.out.println("0");
			}
			else if(a%4==0)
			{System.out.println(a/4);
			}
			else
			{System.out.println((a/4)+1);
			}
			t--;
			}
		 	}
			
			}
		

	








