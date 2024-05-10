package filehandling;
import java.io.FileOutputStream;
import java.io.DataInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileWrite {

	public static void main(String[] args) {
		FileOutputStream fileOutputStream = null;
		try {
			fileOutputStream = new FileOutputStream("D:/Stream/nw.txt");
			DataInputStream dis = new DataInputStream(System.in);
			System.out.println("Enter the data");
			String data = dis.readLine();
			byte input[] = data.getBytes();
			fileOutputStream.write(input);
		}
		catch(FileNotFoundException fe) {
			fe.printStackTrace();
		}
		catch(IOException ie) {
			System.out.println();
		}
		finally {
			try {
				fileOutputStream.close();
			}
			catch(IOException ie) {
				ie.printStackTrace();
			}
		}

	}

}
