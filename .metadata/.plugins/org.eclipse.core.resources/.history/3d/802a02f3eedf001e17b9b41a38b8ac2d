package core.java.Serialization;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class A implements Serializable{
	B b = new B();
}

class B implements Serializable{
	C c = new C();
}

class C implements Serializable{
	int i = 70;;
}

public class ObjectGraphInSerialization {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		A a = new A();
		FileOutputStream fos = new FileOutputStream("abc.ser");
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		oos.writeObject(a);
		
		FileInputStream fis = new FileInputStream("abc.ser");
		ObjectInputStream ois = new ObjectInputStream(fis);
		A a1 = (A)ois.readObject();
		System.out.println(a1.b.c.i);
	
		
	}

}
