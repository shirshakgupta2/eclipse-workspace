

import java.util.Scanner;
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{int n=0;
		Scanner scan=new Scanner(System.in);
			int T=scan.nextInt();
		for(T=4;T>0;T--)	    
			{
			    
			
		int X=scan.nextInt();
		int Y=scan.nextInt();int Z=scan.nextInt();
	for(int i=0;i<=n;i++)
	{	if(n*X+Y<=Z)
	{
		    n++;
		}
	}
		System.out.print(n);
			}
	}
}
