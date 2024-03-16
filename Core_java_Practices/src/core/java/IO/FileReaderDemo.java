package core.java.IO;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class FileReaderDemo  {

	public static void main(String[] args)throws IOException  {
		
		//Approch--1
		
		// TODO Auto-generated method stub
//		FileReader fr= new FileReader("Example.txt");
//		int i=fr.read();
//		while(i!=-1) {
//			System.out.println((char)i);
//			i=fr.read();
//		}
//      
		//Approch--2
		
		File f = new File("Example.txt");
		FileReader fr = new FileReader(f);
		char[] ch = new char[(int)f.length()];
		fr.read(ch);
		for(char ch1 : ch) {
			System.out.println(ch1);
		}
	}

}
