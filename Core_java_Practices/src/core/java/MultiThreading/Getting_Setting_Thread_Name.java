package core.java.MultiThreading;

class MyThread1 extends Thread{
	
}
public class Getting_Setting_Thread_Name {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(Thread.currentThread().getName());
		Thread.currentThread().setName("Parent");
		System.out.println(Thread.currentThread().getName());

		MyThread1 t= new MyThread1();
		System.out.println(t.getName());
		t.setName("Child");
		System.out.println(t.getName());
	}

}
