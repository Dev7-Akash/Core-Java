package core.java.MultiThreading;


class Print{
	
	public static synchronized void wish(String name) {
		
		for(int i=0; i<=5; i++) {
			System.out.print("Good Morning :");
			
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			System.out.println(name);
		}
	}
}

class MyThread9 extends Thread{
	Print p;
	String name;
	
	MyThread9(Print p, String s){
		this.name=s;
		this.p=p;
	}
	
	
	@Override
	public void run() {
		// TODO Auto-generated method stub
		Print.wish(name);
	}
}


public class ClassLevelSynchronization {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Print d= new Print();
		
       MyThread9 t1= new MyThread9(d, "Rohit");
       
       MyThread9 t2= new MyThread9(d, "Virat");
       
       t1.start();
       t2.start();
       
	}

}
