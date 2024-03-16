package core.java.MultiThreading;


class ThreadA extends Thread{
 int total=0;	
 
 @Override
	public void run() {
		// TODO Auto-generated method stub
		synchronized (this) {
			System.out.println("Child Thread Starts Execution");
			
			for(int i=0; i<=100; i++) {
				total+=i;
			}
			System.out.println("Child Thread Going To Give Notification Call");
			this.notify();
		}
	}
}


public class InterThreadCommunication {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
         ThreadA a = new ThreadA();
         a.start();
         
         synchronized (a) {
			System.out.println("Main Thread Calling Wait Method");
			a.wait();
			System.out.println("Main Method Got Notification Call");
			System.out.println(a.total);
		}
	}

}
