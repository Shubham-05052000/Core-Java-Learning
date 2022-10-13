package filehandling;
import java.io.*;
public class Rename {

	public static void main(String[] args) {
		File f =new File("C:\\Users\\SH40137695\\eclipse-workspace\\Java Learning\\src\\filehandling\\FileCreate\\REname.txt");
		File r = new File("C:\\Users\\SH40137695\\eclipse-workspace\\Java Learning\\src\\filehandling\\FileCreate\\rename.txt");
		if(f.exists()) {
			System.out.println(f.renameTo(r));
		}
		else {
			System.out.println("file does not exit ..!");
		}

	}

}
