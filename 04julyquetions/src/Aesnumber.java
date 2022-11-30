import java.util.Scanner;
public class Aesnumber {
	static boolean isAesNumber(int n){
		int count=0;
		for(int i=1;i<=n;i++){
			if(n%i==0){
				count++;
			}
		}
		if(count==4) {
			return true;
		}
		else {
			return false;
		}
	}
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		int n=scan.nextInt();
		/*Aesnumber d=new Aesnumber();
		boolean m = d.isAesNumber(a);*/
		System.out.println(isAesNumber(n));
	}

}
