package pattern;

public class pattern18 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
for(int i=0;i<=10;i++) {
	for(int j=1;j<=6-i&&i<=5;j++)
	{System.out.print(" ");
}
	
		for(int k=1;k<=2*i-1&&i<=5;k++) {
			System.out.print("*");
		}System.out.println();
		

if(i>5) {
	System.out.print(" ");
			for(int m=1;m<=9;m++)
			{
				System.out.print("*");
			}
}
System.out.println();	
	}

}
}