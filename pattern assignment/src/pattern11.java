
public class pattern11
{

	public static void main(String[] args) 
	{
		int count=1;
		for(int i=1;i<=5;i++)
		{
		
			if(i%2==0) 
			{
				int countRev=count+i-1;
				//for loop here is very imp so to keep printing countRev//
				for(int j=1;j<=i;j++)
				{
			System.out.print(countRev--);
			//making this[count++] here increase value of count every time it print countRev//
			count++;
			    }
			}
			else
			{ 
				for(int j=1;j<=i;j++)
				System.out.print(count++);
			}
	        System.out.println();
	     }
		System.out.println();

	}

}//very important program



