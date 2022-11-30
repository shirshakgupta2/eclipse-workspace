
public class SubString {
	static void printAllSubString(String st) {
		for(int len=1;len<=st.length();len++) {
			for(int s=0;s<=(st.length()-len);s++) {
				for(int e=s;e<=(s+len)-1;e++) {
					System.out.print(st.charAt(e));
				}System.out.println();
			}
			
		}
		
	}
	static void printkNoSubString(String st,int k) {

			for(int s=0;s<=(st.length()-k);s++) {
				for(int e=s;e<=(s+k)-1;e++) {
					System.out.print(st.charAt(e));
				}
				System.out.println();
			}
	}
	static void longestNonRepeatingSubString( String st) {
		String res="";
		
		for(int i=0;i<st.length();i++) {
			String temp="";
			for(int j=i;j<st.length();j++) {
			if(temp.indexOf(st.charAt(j))==-1) {    // very imp part of this question
				temp=temp+st.charAt(j);
			}
			else {
				break;
			}
			}
			if(temp.length()>res.length()) {
				res =temp;
			}
		}
		System.out.println(res);
	}
	
	static void MaxInSubString(String st) {
		int k=(st.length())*(st.length()+1)/2;
		String a[]= new String [k];
		for(int len=1;len<=st.length();len++) {
			for(int s=0;s<=(st.length()-len);s++) {
				for(int e=s;e<=(s+len)-1;e++) {
					System.out.print(st.charAt(e));
				}System.out.println();
			}
			
		}
	}
	static void MaxInSubString2(String st) {
		
	}
		public static void main(String[] args) {
		String st="tapacademy";
		System.out.println(st);
		System.out.println(st.substring(0,1));
		//st=swapArray(st);
	//	longestNonRepeatingSubString(st);
	    //printAllSubString(st);
		//printkNoSubString(st,3);
		
		}

	}


