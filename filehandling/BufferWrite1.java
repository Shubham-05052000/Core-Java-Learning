package filehandling;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class BufferWrite1 {

	public static void main(String[] args)throws IOException {
		FileWriter r = new FileWriter("C:\\Users\\SH40137695\\eclipse-workspace\\Java Learning\\src\\filehandling\\FileCreate\\Writer.txt",true);
		BufferedWriter f = new BufferedWriter(r);
		f.write(" \nCore java Buffered Writer");
		f.close();
	}

}
