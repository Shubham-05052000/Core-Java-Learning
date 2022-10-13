package filehandling;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
public class FileWrite {

	public static void main(String[] args) {
		try {
			File f = new File("C:\\Users\\SH40137695\\eclipse-workspace\\Java Learning\\src\\filehandling\\FileCreate\\Writer.txt");
			FileWriter r = new FileWriter("C:\\Users\\SH40137695\\eclipse-workspace\\Java Learning\\src\\filehandling\\FileCreate\\Writer.txt");
			try {
				r.write("core java study");
				System.out.println("file lengths "+f.length());
			}
			finally {
				r.close();
			}
			System.out.println("Succesfully write data in file ");
		}
		catch(IOException n) {
			System.out.println(n);
		}
		
		
	}

}
