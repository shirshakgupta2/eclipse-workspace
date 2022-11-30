import java.util.Scanner;
public class FirstAndLast {
public static void main (String [] args) {
	Scanner scan =new Scanner (System.in);
	int t =scan.nextInt();
	while (t>0) {
	int last=0;
	int n=scan.nextInt();
    last=n%10;
	while(n>10) {
		 n=n/10;
	}
	int sum =n+last;
	System.out.println(sum);
	t--;
	
	}
	
}
}
