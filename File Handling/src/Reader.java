import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Reader {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		String path="C:\\Users\\HP\\OneDrive\\Pictures\\Camera Roll\\input.txt";
		File file = new File(path);
		
		// for reading the file to our java code we need to use fileRead
		FileReader reader = null;// IMP POINT TO KEEP IN MIND
		try {
			reader = new FileReader(file);
			
			int read = reader.read();
			while(read!=-1) {
				System.out.println((char)read);
				read = reader.read();
			}
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		

	}

}
