import java.util.Scanner;

public class FindPrimeAndDifference {
	public static int findNextPrime(int number) {
		while (!isPrime(number)) {
			number++;
		}
		return number;
	}
	public static boolean isPrime(int n) {
		if(n==1)
			return false;
		if(n==2||n==3)
			return true;
		if(n%2==0||n%3==0)
			return false;
		for (int i = 5; i*i<=n; i=i+6) {
		
			if(n%i==0||n%(i+2)==0)
				return false;
		}
		return true;
	}

    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int input = scanner.nextInt();
        if (isPrime(input)) {
			System.out.println(input+" is a prime no.");
		} else {
			System.out.println(input+" is not a prime no.");

		}
        int nextPrime = findNextPrime(input);
        
        int difference = nextPrime - input;
        System.out.println("Difference between the number and the next prime is " + difference);
    }
    
    
}