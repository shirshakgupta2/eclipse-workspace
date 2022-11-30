package pattern;

import java.util.Scanner;

public class pattern27 {

//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//		for(int i=1;i<=5;i++)
//		{
//		for(int j=1;j<=6-i;j++)
//		{
//			System.out.print(" ");
//			
//		} 
//		for(int k=1;k<=(2*i-1);k++) 
//		{
//			if(i==5||k==2*i-1||k==1)
//			{
//				System.out.print(k);
//			}
//			else
//			{
//				System.out.print(" ");
//				
//			}
//				
//		}
//		System.out.println();
//		}
//	}
	static void  pattren(int n){
	     for(int i = 1; i <= n; i++)
	     {
           int count = 1;
//           for(int k = 1; k <= n-i; k++)
//           {
//               System.out.print();
//           }
           for(int j = 1; j <= (2*i)-1; j++)
           {
               if(j < i)
               {
                   System.out.print(count++ );
               }
               else
               {
                   System.out.print(count--);
               }
            }
           System.out.print(" ");
	     }
	}

	public static void main(String[] args) {

		//Write your code here
		Scanner scan=new Scanner(System.in);
		
		int n = scan.nextInt();
		pattren(n);
	}

}
