
public class stackoverflow {
	/*static void fun() {
		System.out.println("inside fun");
		fun();
	}*/
	
	// if this is an exception then exception can be handeled 
	//but it is not an exception its an error
	static void fun() {
		System.out.println("inside fun");
		try {
		fun();
		}
		catch(Exception e) {
			System.out.println("exception handled");  //its the same error so it meanes it is runtime error not exception 
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		fun();

	}

}
    



/*Exception in thread "main" java.lang.StackOverflowError
at java.base/java.nio.CharBuffer.wrap(CharBuffer.java:408)
at java.base/sun.nio.cs.StreamEncoder.implWrite(StreamEncoder.java:281)
at java.base/sun.nio.cs.StreamEncoder.write(StreamEncoder.java:132)
at java.base/java.io.OutputStreamWriter.write(OutputStreamWriter.java:207)
at java.base/java.io.BufferedWriter.flushBuffer(BufferedWriter.java:120)
at java.base/java.io.PrintStream.writeln(PrintStream.java:726)
at java.base/java.io.PrintStream.println(PrintStream.java:1041)
at stackoverflow.fun(stackoverflow.java:4)
at stackoverflow.fun(stackoverflow.java:5)
at stackoverflow.fun(stackoverflow.java:5)
at stackoverflow.fun(stackoverflow.java:5)*/
