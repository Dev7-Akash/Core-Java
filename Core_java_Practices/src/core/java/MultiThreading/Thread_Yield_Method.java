package core.java.MultiThreading;


class MyThread3 extends Thread {
	@Override
	public void run() {
		// TODO Auto-generated method stub
		for(int i=0; i<=5; i++) {
			
			
			Thread.yield();
			System.out.println("Child Thread");
		}
	}
}

public class Thread_Yield_Method {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyThread3 t = new MyThread3();
		t.start();
		
		for(int i=0; i<=5; i++) {
		System.out.println("Main Thread");
		}

	}

}
