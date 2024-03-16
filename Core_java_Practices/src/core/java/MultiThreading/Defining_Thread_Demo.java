package core.java.MultiThreading;


class MyThread extends Thread{
	@Override
	public void run() {
		// TODO Auto-generated method stub
		for(int i=0; i<=10; i++) {
			System.out.println("Thread By extending Thread class");
		}
	}
	
}


class MyRunnable implements Runnable{
	@Override
	public void run() {
		// TODO Auto-generated method stub
	
		for(int i=0; i<=10; i++) {
			System.out.println("Thread By Implementing Runnable Interface");
		}
	}
}
public class Defining_Thread_Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		MyThread mt=new MyThread();
		mt.start();
		
		MyRunnable mr= new MyRunnable();
		Thread t = new Thread(mr);
		t.start();
		
		System.out.println("Main Thread");
		
	}

}
