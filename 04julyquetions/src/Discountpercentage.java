import java.util.Scanner;
public class Discountpercentage {
	
	float calculateDiscount(float a,float b,float c, float d) {
		float d1=0.0f;//Has to be initialized becoz its an local variable not instance variable which stays in heap//
		float d2=0.0f;
		 d1=(float)((a*0.07)+(b*0.03)+(c*0.02)+(d*0.01));//Type casting was very imp for this becoz it will have an error 
		                                                // Error will be double can not be converted to float so in (float)this was imp.   		
		float sum=(float)(a+b+c+d);
		if	(sum<=25000) {
			d2=(float)0;
		}
		 if(sum>=25001&&sum<=50000) {
			d2=(float)(0.05*sum) ;
		}
		 if(sum>=50001&&sum<=100000){
			d2=(float)(0.07*sum);
		}
		 if(sum>=100001){
			d2=(float)(0.1*sum) ;
		}
		 if(d1>d2) {
			System.out.println(d1);
			System.out.println(d2);
			System.out.println("Since d1 is more take a discount of d1 type");
		return d1;}
		else {System.out.println(d1);
		System.out.println(d2);
			System.out.println("Since d2 is more take a discount of d2");
		return d2;}
		}
		public static void main(String[] args) {
	    Scanner scan=new Scanner(System.in);
System.out.println("Enter the amount of iron you bought");
float iron=scan.nextFloat();
System.out.println("Enter the amount of steel you bought");
float steel= scan.nextFloat();
System.out.println("Enter the amount of tungsten you bought");
float tun= scan.nextFloat();
System.out.println("Enter the amount of nickel you bought");
float nic=scan.nextFloat();
/* calculateDiscount d=new calculateDiscount();  //if this was not defined then and if the class object is not called then we can not accesss to any other method//
   calculateDiscount(iron,steel,tun,nic);*/    // method is alwys called by the adress which is allocated in d here without d we can not call the method//

Discountpercentage d=new Discountpercentage();
   d.calculateDiscount(iron,steel,tun,nic);
   	
	}

}
