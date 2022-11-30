
public class pattern15 {
	public static void main(String[] args) {
		for(int i=1;i<=5;i++) {
			for(int j=1;j<6-i;j++) {
				System.out.print(" ");
			}
			int count=i-1;
			for(int k=1;k<=2*i-1;k++) {
				if(k<=i) {
					System.out.print(count);
					if(count!=0) {
						count--;
					}
				}
				else {
					System.out.print(++count);
				}
			}
			System.out.println();
		}
	}

}
