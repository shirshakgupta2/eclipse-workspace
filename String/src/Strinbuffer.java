
public class Strinbuffer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     StringBuffer st=new StringBuffer();
     System.out.println(st.capacity());
	 st.append("java");
	 System.out.println(st);
	 st.append(" javascript");
	 System.out.println(st);
	 System.out.println(st.capacity());
	 st.append(" james 10 gosiling"); // size increse by curr_size*2+2
	 System.out.println(st);
	 System.out.println(st.capacity()); // here we observe wasteage of memory so to make the capacity equal to length
	 System.out.println(st.length());// no of characters present
	 st.trimToSize();// trim the capacity to length of string 
	 System.out.println(st.length());
	 st.delete(1, 10);// start is inclusive and end is exclusive
	 System.out.println(st);
	 
	}
	
	

}
