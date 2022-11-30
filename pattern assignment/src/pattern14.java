
public class pattern14 {

	public static void main(String[] args) {
				// TODO Auto-generated method stub
/*for(int i=1;i<=5;i++)
	
{int s=2;
	for(int j=1;j<=i;j++)
	{ 
		if(j==1)
		{
		System.out.print(i+" ");
	}
		else 
		{
			int sum=i+j+s;
		System.out.print(sum+" ");
		
		s=s+2;}
		
	}
System.out.println();}*/
		
		for(int i=1;i<=5;i++)
			
		{int count=4;int temp=i;
			for(int j=1;j<=i;j++)
			{ 
				System.out.print(temp+" ");
				temp=count+temp;count--;}
			 
			
			System.out.println();}
		
		}

}
