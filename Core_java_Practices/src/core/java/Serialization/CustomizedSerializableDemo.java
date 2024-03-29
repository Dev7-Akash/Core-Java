package core.java.Serialization;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class Account implements Serializable{
	String userName = "Akash";
	transient String pwd = "Java";
}

public class CustomizedSerializableDemo {

	public static void main(String[] args)throws Exception {
		// TODO Auto-generated method stub
		Account a = new Account();
		System.out.println(a.userName+"..........."+a.pwd);
		FileOutputStream fos = new FileOutputStream("abc.ser");
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		oos.writeObject(a);
		
		FileInputStream fis = new FileInputStream("abc.ser");
		ObjectInputStream ois = new ObjectInputStream(fis);
		Account a1 = (Account)ois.readObject();
		
		System.out.println(a1.userName+".........."+a1.pwd);

	}

}
