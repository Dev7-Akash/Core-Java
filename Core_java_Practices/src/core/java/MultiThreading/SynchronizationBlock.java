package core.java.MultiThreading;


class Sender{
	 public void SenderMsg(String msg)  
	  {   
	    System.out.println("\nSending a Message: "  + msg);  
	    try  
	    {   
	      Thread.sleep(800);   
	    }   
	    catch (Exception e)   
	    {   
	      System.out.println("Thread interrupted.");   
	    }   
	    System.out.println("\n" +msg+ "Sent");  
	  }  
}

class SenderThread extends Thread{
	 private String msg;   
	  Sender sd;   
	  
	  SenderThread(String m, Sender obj)  
	  {   
	    msg = m;  
	    sd = obj;   
	  }   
	  
	  public void run()   
	  {   
	    // Checks that only one thread sends a message at a time.   
	    synchronized(sd)   
	    {   
	      // synchronizing the sender object   
	      sd.SenderMsg(msg);  
	    }   
	  }   
}

public class SynchronizationBlock {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Sender sender = new Sender();   
		    SenderThread s1 = new SenderThread( "Welcome To Java " , sender);  
		SenderThread s2 =  new SenderThread( "This Is Synchronization In Java ", sender);  
		  
		    // Start two threads of SenderThread type   
		    s1.start();   
		    s2.start();   
		  
		   //  wait for threads to end   
		    try  
		    {   
		      s1.join();   
		      s2.join();   
		    }   
		    catch(Exception e)   
		    {   
		      System.out.println("Interrupted");   
	}

}
}