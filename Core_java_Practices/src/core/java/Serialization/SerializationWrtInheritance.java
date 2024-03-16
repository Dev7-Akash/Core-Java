package core.java.Serialization;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class Animal implements Serializable{
	int i = 10;
	
}

class Lion extends Animal{
	int j = 20;
}

public class SerializationWrtInheritance {

	public static void main(String[] args)throws Exception {
		// TODO Auto-generated method stub
		Lion l = new Lion();
		System.out.println(l.i+"..........."+l.j);
		FileOutputStream fos = new FileOutputStream("abc.ser");
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		oos.writeObject(l);
		
		FileInputStream fis = new FileInputStream("abc.ser");
		ObjectInputStream ois = new ObjectInputStream(fis);
		Lion l1 = (Lion)ois.readObject();
		
		System.out.println(l1.i+".........."+l1.j);

	}

}