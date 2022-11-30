public class pattern1 {
	public static void main(String args[]){
		for(int i=1;i<=5;i++)
		{
			for(int j=1;j<=5;j++)
			{
				if(j==i)
				{
					System.out.print(j);
				}
				else
				{
					System.out.print("1");
				}
				
			}
			System.out.println();
		}
}
}