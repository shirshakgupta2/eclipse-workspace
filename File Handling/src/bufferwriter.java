import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.Scanner;

public class bufferwriter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		String path="C:\\\\Users\\\\HP\\\\OneDrive\\\\Pictures\\\\Camera Roll\\\\bufferwriterclass.txt";
//		FileWriter writer=null;
//		BufferedWriter writer1=null;
		//int n=scan.nextInt();
		PrintWriter writer=null;
		try {
//			writer=new FileWriter(path);
//			writer1=new BufferedWriter(writer);
//			writer1.write(65);// only char or string or integer values allowed in write method
			writer =new PrintWriter(path);
			writer.write(65+"\n");// only char or string or integer values allowed in write method
			writer.print(65+"\n");
			writer.print(true+"\n");
			writer.print(56.254+"\n");
			writer.println(false);
			writer.println('P');
			writer.flush();
		} catch (Exception e) {
			// TODO: handle exception
		}
		System.out.println(); 

	}

}
