package core.java.Serialization;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class SerializableDemo1 {

	public static void main(String[] args)throws Exception {
		// TODO Auto-generated method stub
		Dog d1= new Dog();
		System.out.println("Serialization Started");
		FileOutputStream fos = new FileOutputStream("abc.ser");
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		oos.writeObject(d1);
		System.out.println("Serialization Ended");
		System.out.println("Deserialization Sarted");
		FileInputStream fis = new FileInputStream("abc.ser");
		ObjectInputStream ois = new ObjectInputStream(fis);
		Dog d2 = (Dog)ois.readObject();
		System.out.println("DeSerialization Ended");
		
		System.out.println(d2.i+"..........."+d2.j);
		
	}

}
