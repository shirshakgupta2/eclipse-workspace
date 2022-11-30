
public class pattern9 {

	public static void main(String[] args) {
		
	for(int i=1;i<=5;i++)
	{int count=1;
		for(int j=1;j<=5-i;j++)
		{
			System.out.print(" ");
		}
		for(int k=1;k<=i;k++)
		{
			
			System.out.print(count);
			count++;
		}
		System.out.println();
	}
	}

}
//wecan slove it like this also//
/*for(int i=1;i<=5;i++)
{
for(int j=1;j<=5-i;j++)
{
	System.out.print(" ");
}
for(int k=1;k<=i;k++)
{
	
	System.out.print(k);
	
}
System.out.println();
}*/