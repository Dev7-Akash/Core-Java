package core.java.MultiThreading;


class MyThread6 extends Thread{
	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("Child starts execution");
		
		try {
		for(int i=0; i<=5; i++) {
			System.out.println("Child Thread Running");
			System.out.println("Child going to sleep");
			
				Thread.sleep(3000);
				System.out.println("Child completed execution");

		}
		}
			 catch (InterruptedException e) {
				// TODO Auto-generated catch block
				System.out.println("child got intrrupted");
			}
					
		
	}
}
public class Intrrupting_Thread {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		MyThread6 t = new MyThread6();
		t.start();
		t.interrupt();
		
		for(int i=0; i<=5; i++) {
			System.out.println("Main Thread");
		}

	}

}
