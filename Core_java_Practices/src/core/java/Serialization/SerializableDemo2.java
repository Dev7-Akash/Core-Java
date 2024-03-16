package core.java.Serialization;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class SerializableDemo2 {

	public static void main(String[] args)throws Exception {
		// TODO Auto-generated method stub
		Dog d1= new Dog();
		Cat c1 = new Cat();
		System.out.println("Serialization Started");
		FileOutputStream fos = new FileOutputStream("abc.ser");
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		oos.writeObject(d1);
		oos.writeObject(c1);
		System.out.println("Serialization Ended");
		System.out.println("Deserialization Started");
		FileInputStream fis = new FileInputStream("abc.ser");
		ObjectInputStream ois = new ObjectInputStream(fis);
		Dog d2 = (Dog)ois.readObject();
		Cat c2 = (Cat)ois.readObject();
		System.out.println("DeSerialization Ended");
		
		System.out.println(d2.i+"..........."+d2.j);
		System.out.println(c2.i+"..........."+c2.j);
		
	}

}
