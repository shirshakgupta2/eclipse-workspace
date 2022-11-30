import java.util.StringTokenizer;
public class stringtoken {

	public static void main(String[] args) {
		String s="JAVA PYTHON SQL AI";
		StringTokenizer st=new StringTokenizer(s," ");//ask jvm to create an object of class name stringTokenizer
		/*if(st.hasMoreTokens()) {// hasMoreTokens() will give output true(it means chopping is possible) or false
			System.out.println(st.nextToken());//nextToken() will take out the word before chopping
		}*/
		while(st.hasMoreTokens()) {
			System.out.println(st.nextToken());
		}
		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println();
		StringTokenizer stt=new StringTokenizer(s,"A");
		while(stt.hasMoreTokens()) {
			System.out.println(stt.nextToken());
		}
	}

}

