package core.java.Serialization;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class SerializableDemo4 {

	public static void main(String[] args)throws Exception {
		// TODO Auto-generated method stub
		Dog d1= new Dog();
		Cat c1 = new Cat();
		Rat r1 = new Rat();
		System.out.println("Serialization Started");
		FileOutputStream fos = new FileOutputStream("abc.ser");
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		oos.writeObject(d1);
		oos.writeObject(c1);
		oos.writeObject(r1);
		System.out.println("Serialization Ended");
		System.out.println("Deserialization Started");
		FileInputStream fis = new FileInputStream("abc.ser");
		ObjectInputStream ois = new ObjectInputStream(fis);
//		Dog d2 = (Dog)ois.readObject();
//		Cat c2 = (Cat)ois.readObject();
//		Rat r2 = (Rat)ois.readObject();
//		System.out.println("DeSerialization Ended");
//		
//		System.out.println(d2.i+"..........."+d2.j);
//		System.out.println(c2.i+"..........."+c2.j);
//		System.out.println(r2.i+"..........."+r2.j);
//		
		// If we don't know the order then
		
		Object o = ois.readObject();
		if(o instanceof Dog) {
			Dog d2 = (Dog)o;
			System.out.println("Dog");
			System.out.println(d2.i+"..........."+d2.j);
		}
		else if (o instanceof Cat) {
			Cat c2 = (Cat)o;
			System.out.println("Cat");
			System.out.println(c2.i+"..........."+c2.j);
		}
		else if (o instanceof Rat) {
			Rat r2 = (Rat)o;
			System.out.println("Rat");
			System.out.println(r2.i+"..........."+r2.j);
		}
	}

}