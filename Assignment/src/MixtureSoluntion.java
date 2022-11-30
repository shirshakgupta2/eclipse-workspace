
import java.util.*;

class MixtureSolution
{ static void isMixture(int A,int B){
    if(A>0&&B>0){
        System.out.println("Solution");
    }
    else if(B==0){
        System.out.println("Solid");
    }
    else if(A==0){
        System.out.println("Liquid");
    }
   
    
    
}
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner scan= new Scanner(System.in);
		int t=scan.nextInt();
		while(t>0) {
		int A=scan.nextInt();
		int B=scan.nextInt();
  
		isMixture(A,B);
	     t--;}
        }
	
}



