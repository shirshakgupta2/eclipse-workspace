import java.util.Random;
import java.util.Scanner;
class calculating extends Thread{
	@Override
	public void run() {
		Scanner scan = new Scanner(System.in);
		for(;;) {
			Random ran = new Random();
			int a=ran.nextInt(56);
			System.out.println(a);
			int b=ran.nextInt(44);
			System.out.println(b);
			int result=scan.nextInt();
			if(result==(a+b)) {
				System.out.println("correct continue");
			}
			else {
				System.out.println("wrong ans please continue");
			}
		}
		
	}
}
class timer extends Thread{
	int n;
	timer(int n){
		this.n=n;
	}
	@Override
	public void run() {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		try {
			
			for(int i=n;i>=0;) {
				System.out.println("time left is"+i--);
				Thread.sleep(1000);
			}
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
}
public class randomintinput {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int n=scan.nextInt();
		timer timer = new timer(n);
		calculating calc = new calculating();
		calc.setDaemon(true);
		calc.start();
		
	}

}
