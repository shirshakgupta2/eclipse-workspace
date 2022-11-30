import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Buildinmethod {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		String path="C:\\Users\\HP\\OneDrive\\Pictures\\Camera Roll"
				+ "\\WIN_20221003_15_13_23_Pro.jpg";
		File file = new File(path);
//		System.out.println(file.delete());
		System.out.println(file.getAbsolutePath());
		System.out.println(file.isFile());
		System.out.println(file.list());
		System.out.println(file.isDirectory());
		System.out.println(file.getParent());
		File file2 = new File(file.getParent());
		System.out.println(file2.isDirectory());
		System.out.println(file2.list());
		file.createNewFile();
		System.out.println(file.getParent()+"\\data.txt");
		File file1=new File(file.getParent()+"\\data.txt");
		file1.createNewFile();
		// for the input to the file1 which is data.txt
		Scanner scan = new Scanner(System.in);
		FileWriter writer = new FileWriter(file1);
		writer.write(scan.next());
		//this wont help to write the input into the data.txt file until we do not flush it to the file
		 writer.flush();
		 // this will keep overwriting the previous cotent which means it delete the previous given input if we want to keep priveous
		 // input and append to the previuos inout only the new one 
		  // we have to use filewriter witha boolean value
		
		
		
		

	}

}
