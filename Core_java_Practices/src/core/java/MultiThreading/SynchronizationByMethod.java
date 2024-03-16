package core.java.MultiThreading;


class Display{
	
	public synchronized void wish(String name) {
		
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

class MyThread7 extends Thread{
	Display d;
	String name;
	
	MyThread7(Display d, String s){
		this.name=s;
		this.d=d;
	}
	
	
	@Override
	public void run() {
		// TODO Auto-generated method stub
		d.wish(name);
	}
}


public class SynchronizationByMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Display d= new Display();
		
       MyThread7 t1= new MyThread7(d, "Rohit");
       
       MyThread7 t2= new MyThread7(d, "Virat");
       
       t1.start();
       t2.start();
       
	}

}
