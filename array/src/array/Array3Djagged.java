package array;

import java.util.Scanner;

public class Array3Djagged {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[][][]=new int [2][][];
		a[0]=new int[3][];
		a[1]=new int[2][];
		a[0][0]=new int[2];
		a[0][1]=new int [3];
		a[0][2]=new int[3];
		a[1][0]=new int [2];
		a[1][1]=new int [3];
		Scanner scan =new Scanner(System.in);
		for(int i=0;i<=a.length-1;i++)
		{for(int j=0;j<=a[i].length-1;j++)
		{for(int k=0;k<=a[i][j].length-1;k++)
			{System.out.println("enter the ages of school"+i+"school girls is"+j+"class"+k);
			 a[i][j][k]=scan.nextInt();
			}
		}
		}System.out.println("ages are");
		for(int i=0;i<=a.length-1;i++)
		{for(int j=0;j<=a[i].length-1;j++)
			{for(int k=0;k<=a[i][j].length-1;k++)
			{System.out.println(a[i][j][k]);
			}
			}
			}
	}

} 
