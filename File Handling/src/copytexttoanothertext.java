import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class copytexttoanothertext {
	public static void copyOfFileToAnotherFile(File file,File file1) {
		FileReader reader = null;// IMP POINT TO KEEP IN MIND
		
		FileWriter writer = null;
		try {
			writer = new FileWriter(file1);
			reader = new FileReader(file);
			
			int read = reader.read();
			while(read!=-1) {
				writer.write((char)read);
				read = reader.read();
			}
			writer.flush();// if i dont call it will not write all the data to new file
			
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		catch (IOException e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}
	public static void readFirstLine(File file) {
		FileReader reader = null;// IMP POINT TO KEEP IN MIND
		BufferedReader reader2 = null;
		
		try {
			reader = new FileReader(file);
			reader2 = new BufferedReader(reader);
			String line = reader2.readLine();
//			System.out.println(line);
//			System.out.println(reader2.readLine());
//			System.out.println(reader2.readLine());
			
			
			while(line!=null) {
				//writer.write((char)read);
				System.out.println(line);
				line = reader2.readLine();
			}
		}
			catch (Exception e) {
				// TODO: handle exception
				e.getStackTrace();
			}
		
		
	}
	public static void countLine(File file) {

		FileReader reader = null;// IMP POINT TO KEEP IN MIND
		BufferedReader reader2 = null;
		int count=0;
		
		try {
			reader = new FileReader(file);
			reader2 = new BufferedReader(reader);
			String line = reader2.readLine();
//			System.out.println(line);
//			System.out.println(reader2.readLine());
//			System.out.println(reader2.readLine());
			
			
			while(line!=null) {
				//writer.write((char)read);
				count++;
				line = reader2.readLine();
			}
		}
		catch (Exception e) {
			// TODO: handle exception
			e.getStackTrace();
		}
		System.out.println(count);
		
	}
	public static void countChar(File file) {
		FileReader reader = null;
		
		try {
			reader = new FileReader(file);
			int read = reader.read();
			int count=0;
			while(read!=-1) {
				//System.out.print((char)read);
				count++;
				read = reader.read();
			}
			System.out.println();
			System.out.println(count);
			//System.out.println(count);
	
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
	public static void question(File file) {
		FileReader reader = null;// IMP POINT TO KEEP IN MIND
		BufferedReader reader2 = null;
		int count=0;
		int sum=0;
		try {
			reader = new FileReader(file);
			reader2 = new BufferedReader(reader);
			String line = reader2.readLine();
			while(line!=null) {
				count++;
				int l=line.length();
				sum+=l;
				System.out.println(sum);
				line=reader2.readLine();
			}
			System.out.println(count+"  "+sum);
		}
		catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();;
		}
	}

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		String path="C:\\Users\\HP\\OneDrive\\Pictures\\Camera Roll\\input.txt";
		String path1="C:\\Users\\HP\\OneDrive\\Pictures\\Camera Roll\\copywriteofinput.txt";
		File file = new File(path);
		File file1 = new File(path1);
		//file1.createNewFile();// if we call create new file or not fileReader will autometically read the and create the new file
		// for reading the file to our java code we need to use fileRead
		
		copyOfFileToAnotherFile(file,file1);
		readFirstLine(file1);
		countLine(file1);
		countChar(file);
		question(file);

	}

}
