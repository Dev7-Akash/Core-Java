package core.java.IO;

import java.io.File;
import java.io.IOException;

public class FileDemo1 {

	public static void main(String[] args)throws IOException {
		// TODO Auto-generated method stub
		int count=0; 
		File f =new File("d:\\Full_Stack_Java_Notes");
		String[] s=f.list();
		for(String s1 :s) {
        count++;
        System.out.println(s1);
	}
		System.out.println("Total No :"+count);

}
}
//To display names of files and directories