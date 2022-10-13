
package filehandling;
import java.io.*;
public class CreateFile {

	public static void main(String[] args)throws IOException {
		File f = new File("C:\\Users\\SH40137695\\eclipse-workspace\\Java Learning\\src\\filehandling\\FileCreate\\Createfile.txt");
		if(f.createNewFile()) {
			System.out.println("file create Sucess...! ");
		}
		else {
			System.out.println("file Already exist..!");
		}

	}

}
