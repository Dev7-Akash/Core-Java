package core.java.IO;

import java.io.FileWriter;
import java.io.IOException;

public class FileWriterDemo1 {

	public static void main(String[] args)throws IOException {
		// TODO Auto-generated method stub
		FileWriter fw=new FileWriter("Example.txt");
		fw.write(101);
		fw.write("Java Developer");
		fw.write("\n");
		char[] ch= {'x','y','z'};
		fw.write(ch);
		fw.write("\n");
		fw.flush();
		fw.close();
				
	}

}
