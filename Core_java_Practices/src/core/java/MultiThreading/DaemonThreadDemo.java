package core.java.MultiThreading;


class MyThread10 extends Thread{
	
}
public class DaemonThreadDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(Thread.currentThread().isDaemon());
		
		MyThread10 t = new MyThread10();
		System.out.println(t.isDaemon());
		t.setDaemon(true);
		t.start();
		//t.setDaemon(true);
		System.out.println(t.isDaemon());

	}

}
