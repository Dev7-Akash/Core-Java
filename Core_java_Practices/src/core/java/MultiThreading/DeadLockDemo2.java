package core.java.MultiThreading;


class A{
	public synchronized void first(B b){
		System.out.println(Thread.currentThread().getName()+" Start Execution of First Method");
		
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		b.last();
	}
	
	public synchronized void last() {
		System.out.println("Inside A class, This is Last Method");
	}
}


class B{
	public synchronized void second(A a){
		System.out.println(Thread.currentThread().getName()+" Start Execution of Second Method");
		
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		a.last();
	}
	
	public synchronized void last() {
		System.out.println("Inside B class, This is Last Method");
	}
}


public class DeadLockDemo2 implements Runnable {
	A a = new A();
	B b = new B();
	
	DeadLockDemo2(){
		Thread t = new Thread(this);
		t.start();
		a.first(b);
	}
	
	@Override
	public void run() {
		// TODO Auto-generated method stub
		b.second(a);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		new DeadLockDemo2();
        
		
	}

}