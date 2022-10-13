package filehandling;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class PrintWriter1 {
	public static void main(String[] args)throws IOException {
		FileWriter r = new FileWriter("C:\\Users\\SH40137695\\eclipse-workspace\\Java Learning\\src\\filehandling\\FileCreate\\Writer.txt",true);
		PrintWriter f = new PrintWriter(r);
		f.write(" \nCore java PrintWriter");
		f.close();
	
	}

}
