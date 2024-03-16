package core.java.MultiThreading;


class MyThread11 extends Thread{
	
	@Override
	public void run() {
		// TODO Auto-generated method stub
		for(int i=0; i<5; i++) {
			System.out.println("Child Thread :"+i);
			
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}


public class StopMethodDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		MyThread11 t = new MyThread11();
		t.start();
		
		for(int i=0; i<5; i++) {
			System.out.println("Main Thread :"+i);
		}
		t.suspend();
		
		try {
			Thread.sleep(10000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		t.resume();
	}

}
