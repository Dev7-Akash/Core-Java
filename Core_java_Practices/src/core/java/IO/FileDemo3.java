package core.java.IO;

import java.io.File;
import java.io.IOException;

public class FileDemo3 {

	public static void main(String[] args)throws IOException {
		// TODO Auto-generated method stub
		int count=0; 
		File f1 =new File("d:\\Full_Stack_Java_Notes");
		String[] s=f1.list();
		for(String s1 :s) {
			File f2=new File(f1,s1);
			if(f2.isFile()) {
        count++;
        System.out.println(s1);
			}
	}
		System.out.println("Total No :"+count);

}
}
//To display only File names