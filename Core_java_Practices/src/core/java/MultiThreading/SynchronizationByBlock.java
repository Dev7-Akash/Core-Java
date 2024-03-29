package core.java.MultiThreading;


class Display1{
	
	public  void wish(String name) {
		
		synchronized (this) {
			
		
		for(int i=0; i<5; i++) {
			System.out.print("Well Played :");
			
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
}

class MyThread8 extends Thread{
	Display1 d;
	String name;
	
	MyThread8(Display1 d, String s){
		this.name=s;
		this.d=d;
	}
	
	
	@Override
	public void run() {
		// TODO Auto-generated method stub
		d.wish(name);
	}
}


public class SynchronizationByBlock {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Display1 d1= new Display1();

		//Display1 d2= new Display1();

       MyThread8 t1= new MyThread8(d1, "Rohit");   
       MyThread8 t2= new MyThread8(d1, "Virat");
       MyThread8 t3= new MyThread8(d1, "Jadeja");
       MyThread8 t4= new MyThread8(d1, "Bumrah");

       
       t1.start();
       t2.start();
       t3.start();
       t4.start();
       
       
	}

}
