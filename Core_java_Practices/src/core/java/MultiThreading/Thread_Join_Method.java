package core.java.MultiThreading;


class MyThread4 extends Thread {
	@Override
	public void run() {
		// TODO Auto-generated method stub
		for(int i=0; i<=5; i++) {
		System.out.println("Child Thread");
		
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		}
	}
}

public class Thread_Join_Method {

	public static void main(String[] args)throws InterruptedException {
		// TODO Auto-generated method stub
		MyThread4 t = new MyThread4();
		t.start();
		t.join();
		
		for(int i=0; i<=5; i++) {
		System.out.println("Main Thread");
		}

	}

}
