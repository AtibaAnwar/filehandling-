package filehandling;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
public class FileEncryption {
	
	public static void main(String[] args) {
		FileInputStream fileInputStream =null;
		FileOutputStream fileOutputStream = null;
		try {
			fileInputStream = new FileInputStream("D:/Stream/nw.txt");
			fileOutputStream = new FileOutputStream("D:/Stream/nwencr.txt");
			int byteData;
			while ((byteData = fileInputStream.read()) != -1) {
				byteData+= 2;
				fileOutputStream.write(byteData);
			}
			int newData;
			fileInputStream = new FileInputStream("D:/Stream/nwencr.txt");
			 while ((newData = fileInputStream.read()) != -1) {
				 System.out.print((char)newData);
				 
			 }
		}
		catch(FileNotFoundException fe) {
			System.out.println("File not found");
		}
		catch(IOException Ie) {
			System.out.println("caught");
		}
		finally {
			try {
				fileInputStream.close();
			}
			catch(Exception ie) {
				ie.printStackTrace();
			}
	}
	}

}
