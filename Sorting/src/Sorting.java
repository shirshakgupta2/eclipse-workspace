import java.util.Scanner;
public class Sorting {
static void bubbleSort(int []ar ) {
	for(int i=0;i<ar.length-1;i++) {
		for(int j=0;j<ar.length-i-1;j++) {
			if(ar[j]>ar[j+1]) {
				int temp =ar[j];
				ar[j]=ar[j+1];
				ar[j+1]=temp;
			}
//			for(int k=0;k<ar.length;k++){
//				System.out.print(ar[k]);
//			}
			//System.out.println();
		}
		System.out.println();
	}
}
static void bubbleSortDecre(int []ar ) {
	for(int i=0;i<ar.length-1;i++) {
		for(int j=0;j<ar.length-i-1;j++) {
			if(ar[j]<ar[j+1]) {
				int temp =ar[j];
				ar[j]=ar[j+1];
				ar[j+1]=temp;
			}
		}
	}
}
static void selectionSort(int ar[]) {
	for(int i=0;i<ar.length-1;i++) {
		int min_i=i;
		for(int j= i+1;j<ar.length;j++) {
		if(ar[j]<ar[min_i]) {
			min_i=j;
		  }
		}
		int temp=ar[i];
		ar[i]=ar[min_i];
		ar[min_i]=temp;
//		for(int k=0;k<ar.length;k++){
//			System.out.print(ar[k]);
//		}
		System.out.println();
		
		
		
	}
	
}
static void selectionSortDecre(int ar[]) {
	for(int i=0;i<ar.length-1;i++) {
		int min_i=i;
		for(int j= i+1;j<ar.length;j++) {
		if(ar[j]>ar[min_i]) {
			min_i=j;
		  }
		}
		int temp=ar[i];
		ar[i]=ar[min_i];
		ar[min_i]=temp;
	}
}
static void insertionSort(int ar[]) {
	for(int i=1;i<ar.length;i++) {
	int key=ar[i];
	int j=i-1;
	
	while(j>=0&&ar[j]>key) {
		ar[j+1]=ar[j];
		j--;
	}
	ar[j+1]=key;
    }
	}
public static  void main(String args[])
{
	Scanner scan=new Scanner(System.in);
	int n=scan.nextInt();
	int ar[]=new int[n];
	for(int i=0;i<ar.length;i++){
		ar[i]=scan.nextInt();
	}
//	bubbleSort(ar);
//	bubbleSortDecre(ar);
	selectionSort(ar);
//	selectionSortDecre(ar);
//	insertionSort(ar);
	for(int i=0;i<ar.length;i++){
	System.out.print(ar[i]);
	}
}
}
