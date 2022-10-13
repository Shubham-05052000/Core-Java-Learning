package filehandling;

import java.io. FileOutputStream;
import java.io.IOException;

public class FileOutStream1Writer {

	public static void main(String[] args)throws IOException {
		FileOutputStream fout;
		fout = new FileOutputStream("C:\\Users\\SH40137695\\eclipse-workspace\\Java Learning\\src\\filehandling\\FileCreate\\Writer.txt",true);
		String s="\n Computer Science FileOutputStream";
		char ch[]=s.toCharArray();
		for(int i=0;i<s.length();i++) {
			fout.write(ch[i]);	
		}
		fout.close(); 
	}

}
