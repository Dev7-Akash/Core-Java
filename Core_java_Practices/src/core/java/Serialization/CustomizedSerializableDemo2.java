package core.java.Serialization;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class Accounts implements Serializable{
	String userName = "Akash";
	transient String pwd = "Java";
	
	private void writeObject(ObjectOutputStream os)throws Exception{
		os.defaultWriteObject();
		String epwd="123"+pwd;
		os.writeObject(epwd);
	}
	
	private void readObject(ObjectInputStream is)throws Exception{
		is.defaultReadObject();
		String epwd=(String)is.readObject();
		pwd=epwd.substring(3);
	}
}

public class CustomizedSerializableDemo2 {

	public static void main(String[] args)throws Exception {
		// TODO Auto-generated method stub
		Accounts a = new Accounts();
		System.out.println(a.userName+"..........."+a.pwd);
		FileOutputStream fos = new FileOutputStream("abc.ser");
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		oos.writeObject(a);
		
		FileInputStream fis = new FileInputStream("abc.ser");
		ObjectInputStream ois = new ObjectInputStream(fis);
		Accounts a1 = (Accounts)ois.readObject();
		
		System.out.println(a1.userName+".........."+a1.pwd);

	}

}