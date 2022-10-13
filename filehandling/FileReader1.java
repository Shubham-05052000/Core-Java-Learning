package filehandling;
import java.io.IOException;
import java.io.*;
public class FileReader1 {

	public static void main(String[] args)throws IOException {
		try {
			FileReader f = new FileReader("C:\\Users\\SH40137695\\eclipse-workspace\\Java Learning\\src\\filehandling\\FileCreate\\rename.txt");
			try {
				int i;
				while((i=f.read())!=-1) {
					System.out.print((char)i);
				}
			}
			finally {
				f.close();
			}
		}
		catch(IOException n) {
			System.out.println("Error Solve");
		}
	}

}
