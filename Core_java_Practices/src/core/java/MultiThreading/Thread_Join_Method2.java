package core.java.MultiThreading;


class MyThread5 extends Thread {
	
	static Thread mt;
	
	@Override
	public void run() {
		// TODO Auto-generated method stub
		for(int i=0; i<=5; i++) {
			try {
				mt.join();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		System.out.println("Child Thread");
		
		}
	}
}

public class Thread_Join_Method2 {

	public static void main(String[] args)throws InterruptedException {
		// TODO Auto-generated method stub
		
		MyThread5.mt =Thread.currentThread();
		
		MyThread5 t = new MyThread5();
		t.start();
		for(int i=0; i<=5; i++) {
			Thread.sleep(3000);
		System.out.println("Main Thread");
		}

	}

}
