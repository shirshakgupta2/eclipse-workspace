package arrayevening;

import java.util.Scanner;

public class Stockbuysellprofit {
	static int timetohavemaxprofit(int prices[]) {
		int maxprofit=0;
		int buy=0,sell=0;
		for (int i = 0; i < prices.length; i++) {
			for (int j = i+1; j < prices.length; j++) {
				if(prices[j]-prices[i]>maxprofit) {
					//System.out.println("buy at ="+""+i+"and sell at="+""+j);
					maxprofit=prices[j]-prices[i];
					 buy=i;
					 sell=j;
					 
				}
			}
			
			
		}
//		System.out.println(buy+""+sell);
//		System.out.println((buy+1)+""+(sell+1));
		return maxprofit;
	}
	static void timetohavemaxloss(int a[]) {
		int max_loss=0;
		int buy=0,sell=0;
		for (int i = 0; i < a.length; i++) {
			for (int j = i+1; j < a.length; j++) {
				if(a[j]-a[i]<max_loss) {
					max_loss=a[j]-a[i];
					 buy=i;
					 sell=j;
				}
			}
			
			
		}
		System.out.println("max loss will be their on when we buy on"+(buy+1)+"and sell on"+(sell+1));
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan =new Scanner(System.in);
		int n=scan.nextInt();
		int a[]=new int[n];
		for(int i=0;i<a.length;i++) {
			a[i]=scan.nextInt();
		}
		 System.out.println(timetohavemaxprofit(a));
		 //timetohavemaxloss(a);
	}

}
