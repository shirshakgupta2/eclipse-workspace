//Note: The Code-stub provided here will help you serve the Object Oriented Principles needed to run the code
//Please add right methods where the Program is asking for the same.
//You are free to make modifications, yet the code must comply to Object-Oriented Programming Concepts.
import java.lang.*;
import java.io.*;
import java.util.*;

class HCF{
    
    int N;
    int Narray[];
    
    public static int gcd(int a,int b){
        //write your Code here:
        if(a==0){
            return b;
        }
        
        return gcd(b%a,a);
    }
    
    public static void addValues(){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int Narray[] = new int[N];
        for(int i=0;i<N;i++){
            Narray[i]=sc.nextInt();
        }
        HCF hcf=new HCF();
        System.out.println(hcf.calculateGCD(Narray,N));

    }
    
    public int calculateGCD(int Narray[],int N){
        //write your Code here:
        int gcd= Narray[0];
        for(int i:Narray){
            gcd=gcd(gcd,i);
            if(gcd==1){
                return 1;
            }
        }
        return gcd;


    }
}
public class rough3
{
    public static void main(String[] args)
    {
        //write your Code here to display object oriented programming principles:
        HCF hcf=new HCF();
        hcf.addValues();

        

        // OUTPUT [uncomment & modify if required]
		System.out.println();
    }
}