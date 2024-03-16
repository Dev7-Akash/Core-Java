package core.java.Serialization;

import java.io.Externalizable;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectInputStream;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;

class ExternalDemo implements Externalizable {
	
	String s;
	int i;
	 int j;
	
	public ExternalDemo(){
		System.out.println("Default Constructor");
		
	}
	
	public ExternalDemo(String s, int i, int j){
		this.s=s;
		this.i=i;
		this.j=j;
		
	}
	
	public void writeExternal(ObjectOutput out)throws IOException{
		out.writeObject(s);
		out.writeInt(i);
	}
	
	public void readExternal(ObjectInput in)throws IOException, ClassNotFoundException{
		s=(String)in.readObject();
		i=in.readInt();
	}
}

public class Externalizable1 {

	public static void main(String[] args)throws Exception {
		// TODO Auto-generated method stub
		ExternalDemo e= new ExternalDemo("Akash",10,20);
		FileOutputStream fos = new FileOutputStream("abc.ser");
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		oos.writeObject(e);
		
		FileInputStream fis = new FileInputStream("abc.ser");
		ObjectInputStream ois = new ObjectInputStream(fis);
		ExternalDemo e1=(ExternalDemo)ois.readObject();
		
		System.out.println(e1.s+"....."+e1.i+".........."+e1.j);
		
	}

}