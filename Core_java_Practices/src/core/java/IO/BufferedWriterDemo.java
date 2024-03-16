package core.java.IO;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class BufferedWriterDemo {

	public static void main(String[] args)throws IOException {
		// TODO Auto-generated method stub
		FileWriter fw = new FileWriter("Example.txt");
		BufferedWriter bw = new BufferedWriter(fw);	
		bw.write(100);
		bw.newLine();
		char[] ch = {'a','b','c','d'};
		bw.write(ch);
		bw.newLine();
		bw.write("Naresh");
		bw.newLine();
		bw.write("Technologies");
		bw.flush();
		bw.close();
	}

}
