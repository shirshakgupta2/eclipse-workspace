import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class mergefile {
	public static void nameFile1(String path) {
		File file=new File(path+"name.txt");
		FileWriter writer = null;
		Scanner scan = new Scanner(System.in);
		try {
			file.createNewFile();
			writer = new FileWriter(path+"name.txt",true);
			do {
				writer.write(scan.nextLine()+"\n");
				

			}
			while(!scan.hasNext("#")) ;
			writer.flush();
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	public static void numberFile1(String path) {
		File file=new File(path+"number.txt");
		FileWriter writer = null;
		Scanner scan = new Scanner(System.in);
		try {
			file.createNewFile();
			writer = new FileWriter(path+"number.txt",true);
			do {
				writer.write(scan.nextLine()+"\n");
				

			}
			while(!scan.hasNext("#")) ;
			writer.flush();
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	public static void mergeFile1AndFile2(String path) {
		String path1=path+"name.txt";
		String path2=path+"number.txt";
		
		FileReader fr1 = null;// IMP POINT TO KEEP IN MIND
		FileReader fr2 = null;// IMP POINT TO KEEP IN MIND
		BufferedReader bf1 = null;
		BufferedReader bf2 = null;
		try {
			fr1 = new FileReader(path1);
			fr2 = new FileReader(path2);
			bf1 = new BufferedReader(fr1);// bufferreader is used becoz file reader doesnot have method to readLine
			bf2 = new BufferedReader(fr2);// bufferreader is used becoz file reader doesnot have method to readLine
			
			String line1 = bf1.readLine();
			String line2= bf2.readLine();
			while(line1!=null||line2!=null) {
				System.out.println(line1+" : "+line2);
				line1 = bf1.readLine();
				 line2= bf2.readLine();
			}
			
		}
		catch (Exception e) {
			// TODO: handle exception
		}
	}
	public static void phonebook(String path) {
		String path1=path+"name.txt";
		String path2=path+"number.txt";
		String path3 =path+"phonebook.txt";
		
		
		FileReader fr1 = null;// IMP POINT TO KEEP IN MIND
		FileReader fr2 = null;// IMP POINT TO KEEP IN MIND
		FileWriter fw1 = null;// IMP POINT TO KEEP IN MIND
		BufferedReader bf1 = null;
		BufferedReader bf2 = null;
		try {
			fr1 = new FileReader(path1);
			fr2 = new FileReader(path2);
			bf1 = new BufferedReader(fr1);// bufferreader is used becoz file reader doesnot have method to readLine
			bf2 = new BufferedReader(fr2);// bufferreader is used becoz file reader doesnot have method to readLine
			
			fw1 = new FileWriter(path3);
			
			String line1 = bf1.readLine();
			String line2= bf2.readLine();
			while(line1!=null||line2!=null) {
				System.out.println(line1+" : "+line2);
				fw1.write(line1+" : "+line2+"\n");
				line1 = bf1.readLine();
				 line2= bf2.readLine();
			}
			fw1.flush();
			
		}
		catch (Exception e) {
			// TODO: handle exception
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String path="C:\\\\Users\\\\HP\\\\OneDrive\\\\Pictures\\\\Camera Roll\\\\";
//		nameFile1(path);
//		numberFile1(path);
//		mergeFile1AndFile2(path);
		phonebook(path);
		

	}

}
