package filehandling;
import java.io.*;
public class CopyOneFile_to_AnotherFile {

	public static void main(String[] args)throws IOException {
		FileInputStream r = new FileInputStream("C:\\Users\\SH40137695\\eclipse-workspace\\Java Learning\\src\\filehandling\\FileCreate\\rename.txt");
		FileOutputStream f = new FileOutputStream ("C:\\Users\\SH40137695\\eclipse-workspace\\Java Learning\\src\\filehandling\\FileCreate\\copy_renamedata.txt");
		int i;
		while((i=r.read())!=-1) {
			f.write((char)i);
		}
		System.out.println(" DAta Are copies ");

	}

}
