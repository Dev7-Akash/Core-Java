package core.java.Serialization;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class SerializableDemo3 {

	public static void main(String[] args)throws Exception {
		// TODO Auto-generated method stub
		TransientDemo t1= new TransientDemo();
		System.out.println("Serialization Started");
		FileOutputStream fos = new FileOutputStream("abc.ser");
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		oos.writeObject(t1);
		System.out.println("Serialization Ended");
		System.out.println("Deserialization Sarted");
		FileInputStream fis = new FileInputStream("abc.ser");
		ObjectInputStream ois = new ObjectInputStream(fis);
		TransientDemo t2 = (TransientDemo)ois.readObject();
		System.out.println("DeSerialization Ended");
		
		System.out.println(t2.i+"..........."+t2.j);
		
	}

}
