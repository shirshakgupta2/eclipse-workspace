import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Iterator;
import java.util.Scanner;

public class fileRadear {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		String path="C:\\Users\\HP\\OneDrive\\Pictures\\Camera Roll\\input.txt";
		File file = new File(path);
		
		// for reading the file to our java code we need to use fileRead
		FileReader reader = null;// IMP POINT TO KEEP IN MIND
		try {
			reader = new FileReader(file);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println((char)reader.read());//m this reads the first charachter and then return the ascii value of that character
//		 so instead  of that we have to write for each loop
		System.out.println((char)reader.read());
		System.out.println((char)reader.read());
		System.out.println();
		int read = reader.read();
		int count=0;
		while(read!=-1) {
			//System.out.print((char)read);
			count++;
			read = reader.read();
		}
		System.out.println();
		System.out.println(count);
//		char[]a=new char[15];
//		System.out.println(reader.read(a));
//		System.out.println(a);
	}

}
