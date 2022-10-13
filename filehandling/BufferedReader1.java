package filehandling;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.*;

public class BufferedReader1 {

	public static void main(String[] args)throws IOException {
		BufferedReader br = new BufferedReader(new FileReader("C:\\Users\\SH40137695\\eclipse-workspace\\Java Learning\\src\\filehandling\\FileCreate\\BufferReader.txt"));
		String s1;
		while((s1=br.readLine())!=null) {
			System.out.println(s1);
		}
		br.close();
	}

}
