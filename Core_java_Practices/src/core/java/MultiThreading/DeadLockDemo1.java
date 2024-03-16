package core.java.MultiThreading;


class SharedResource
{
    synchronized void methodOne(SharedResource s)
    {
        Thread t = Thread.currentThread();
 
        System.out.println(t.getName()+" is executing methodOne...");
 
        System.out.println(t.getName()+" is calling methodTwo...");
        System.out.println(this);
 
        s.methodTwo(this);
 
        System.out.println(t.getName()+" is finished executing methodOne...");
    }
 
    synchronized void methodTwo(SharedResource s)
    {
        Thread t = Thread.currentThread();
 
        System.out.println(t.getName()+" is executing methodTwo...");
 
        System.out.println(t.getName()+" is calling methodOne...");
        System.out.println(this);

 
        s.methodOne(this);
 
        System.out.println(t.getName()+" is finished executing methodTwo...");
    }
}


public class DeadLockDemo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		final SharedResource s1 = new SharedResource();
		 
        final SharedResource s2 = new SharedResource();
 
        Thread t1 = new Thread("Child-1")
        {
            public void run()
            {
                s1.methodOne(s2);
            }
        };
 
        Thread t2 = new Thread("Child-2")
        {
            @Override
            public void run()
            {
                s2.methodTwo(s1);
            }
        };
 
        t1.start();
 
        t2.start();
    }
	}


