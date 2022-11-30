
public class Test3 {

	public static void main(String[] args) {
		/*int[]a= {3,5,8};*/
		/*a[1]=7;*/
		int a[][]= {{1,2,3},{4,5,6},{7,8,9}};
		int sum=0;
		for(int i=0;i<3;i++)
		{for(int j=0;j<3;j++)
		{
			sum +=a[i][j];		}
		}
		System.out.println(sum/5);
	}

}
