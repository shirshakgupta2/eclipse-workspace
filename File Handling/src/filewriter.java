import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class filewriter {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		String path="C:\\Users\\HP\\OneDrive\\Pictures\\Camera Roll\\WIN_20221003_15_13_23_Pro.jpg";
		File file = new File(path);
		File file1=new File(file.getParent()+"\\input.txt");
		file1.createNewFile();
		// for the input to the file1 which is data.txt
		Scanner scan = new Scanner(System.in);
		FileWriter writer = new FileWriter(file1,true);// add true in the constructor gives us the appended values with the previous values
		 
		writer.write(scan.nextLine());
		//this wont help to write the input into the data.txt file until we do not flush it to the file
		 writer.flush();

	}

}
