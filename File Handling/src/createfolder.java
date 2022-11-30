import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class createfolder {

	public static void main(String[] args) throws FileNotFoundException {
		// TODO Auto-generated method stub
		String path="D:\\java notes and pdfs\\FileHandling";
		File file = new File(path);
		file.mkdir();
		FileReader read=new FileReader(path);
		try {
			System.out.println(read.read());
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}

