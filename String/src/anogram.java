import java.util.Arrays;

public class anogram // can the secound string be made from first string
{
	static boolean isAnagram(String s1,String s2) {
		String t="";
		for(int i=0;i<s1.length();i++) {
			if(s1.charAt(i)!=' ') {
				t=t+s1.charAt(i);
			}
			
		}s1=t;
		t="";
		for(int i=0;i<s2.length();i++) {
			if(s2.charAt(i)!=' ') {
		
				t=t+s2.charAt(i);
			}
			
		}s2=t;
		s1=s1.toLowerCase();
		s2=s2.toLowerCase();
		char[] arr1=s1.toCharArray();
		char[] arr2=s2.toCharArray();
		Arrays.sort(arr1);
		Arrays.sort(arr2);
		//System.out.println(arr1);
		s1=new String(arr1);
		s2=new String(arr2);
		System.out.println(s1);
		System.out.println(s2);
		return s1.equals(s2);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1="Funeral";
		String s2="Real fun ";
		System.out.println(isAnagram(s1,s2));

	}

}
