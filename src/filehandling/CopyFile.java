package filehandling;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class CopyFile {

	public static void main(String[] args) {
		FileInputStream fis = null;
		FileOutputStream fos =null;
		try {
			fis =new FileInputStream("D:/Stream/nw.txt");
			fos = new FileOutputStream("D:/Stream/New.txt",true);
			int bytedata;
			while((bytedata = fis.read()) != -1) {
				fos.write(bytedata);
			}
		}
		catch(FileNotFoundException fe) {
			fe.printStackTrace();
		}
		catch(IOException ie) {
			System.out.println();
		}
		finally {
			try {
				fis.close();
				fos.close();
			}
			catch(IOException ie) {
				ie.printStackTrace();
			}
		}


	}

}
