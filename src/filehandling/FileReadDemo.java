package filehandling;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
public class FileReadDemo{
	public static void main(String args[]){
		FileInputStream fileInputStream =null;
		try {
			fileInputStream = new FileInputStream("D:/Stream/BufferDemo.java");
			
			int byteData ;
			while ((byteData = fileInputStream.read()) != -1) {
				System.out.print((char)byteData);
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