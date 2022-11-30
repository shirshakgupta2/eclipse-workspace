import java.util.Scanner;

public class findnoofnos {

	public static void main(String[] args) {
		Scanner scan= new Scanner(System.in);
		int t =scan.nextInt();
		
	while(t>0){
		int n =scan.nextInt();
		int count=0;
		while(n>0) {
		if(n%10==4) {
		count++;
		
		}
		n=n/10;
		}
		
		System.out.println(count);
		t--;
		}
		}

}

