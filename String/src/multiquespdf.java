import java.util.Scanner;

public class multiquespdf {
	
	public static void main(String[] args) {
		
		Scanner scan=new Scanner(System.in);
		String s=scan.nextLine();
		int start=0,end=0;
		String t="";
		for (int i = 0;i<s.length() ; ) {
			start=i;
			for (int j =i ; j < s.length(); j++) {
				if(s.charAt(j)==' '){
					end=--j;
					for (int k = end; k < start; k--) {
						t+=s.charAt(k);
					}
					System.out.println(t);
						
					}
				i=j+1;
				}
				//i=j+1;
				//System.out.println(t);
				
			//}
			
			
		}
		
	}

}
