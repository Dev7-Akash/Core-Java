package core.java.Serialization;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class Vehical {
	int i = 10;
	Vehical(){
		System.out.println("Vehical Constructor Called");
	}
	
}

class Bike extends Vehical implements Serializable{
	int j = 20;
	Bike(){
		System.out.println("Bike Constructor Called");
	}
}

public class SerializationWrtInheritance2 {

	public static void main(String[] args)throws Exception {
		// TODO Auto-generated method stub
		Bike l = new Bike();
		l.i=888;
		l.j=999;
		FileOutputStream fos = new FileOutputStream("abc.ser");
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		oos.writeObject(l);
		
		System.out.println("Deserialization Started");
		FileInputStream fis = new FileInputStream("abc.ser");
		ObjectInputStream ois = new ObjectInputStream(fis);
		Bike l1 = (Bike)ois.readObject();
		
		System.out.println(l1.i+".........."+l1.j);

	}

}
