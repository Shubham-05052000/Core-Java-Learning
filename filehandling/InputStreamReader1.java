package filehandling;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.*;

public class InputStreamReader1  {
	int i;
	public static void main(String[] args) throws IOException {
		FileInputStream f = new FileInputStream("C:\\Users\\SH40137695\\eclipse-workspace\\Java Learning\\src\\filehandling\\FileCreate\\BufferReader.txt");
		
//		char ch=(char)f.read();
//		System.out.println(ch);////----------------single word---------------------
		
		int contents= f.read();
		while(contents!=-1) {
			char ch =(char)contents;
			System.out.print(ch);
			///increment moving to next bytes
			contents=f.read();
		
		}
	}

}
