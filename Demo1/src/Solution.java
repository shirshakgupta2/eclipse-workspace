import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

class Solution{
	public static int findBots(String S){

		int N = S.length();
		int count = 0;
		for(int i = 0; i < N; i++){
			if(i % 2 == 0){
				int k = 0;
				int j = i;
				Set<Character> set = new HashSet<>();
				while(j >= 0)
				{
					if(!set.contains(S.charAt(j)))
					{
						set.add(S.charAt(j));
						k++;
					}
					j--;
				}
				if(isPrime(k))
					count++;
			}
		}
		return count;
		}
	public static boolean isPrime(int n)
	{
		if(n==1)
			return false;
		if(n==2||n==3)
			return true;
		if(n%2==0||n%3==0)
			return false;
		for (int i = 5; i <=Math.sqrt(n); i=i+6) {
		//for (int i = 5; i*i<=n; i=i+6) {
		
			if(n%i==0||n%(i+2)==0)
				return false;
		}
		return true;
	}
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		String s=scan.next();
		System.out.println(findBots(s));;
	}
}