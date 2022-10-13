// Create file filename,location,file inside any data ,file length 
package filehandling;

import java.io.File;
import java.io.IOException;

public class FileImporation {

	public static void main(String[] args)throws IOException {
		File f = new File("C:\\Users\\SH40137695\\eclipse-workspace\\Java Learning\\src\\filehandling\\FileCreate\\Imporatio.txt");
		if(f.createNewFile()) {
			System.out.println("File name "+f.getName());
			System.out.println("File Location paths "+f.getAbsolutePath());
			System.out.println("File Writeable "+f.canWrite());
			System.out.println("file readable "+f.canRead());
			System.out.println("File lengths "+f.length());
		}
		else {
			System.out.println("file Does not exist");
		}

	}

}
