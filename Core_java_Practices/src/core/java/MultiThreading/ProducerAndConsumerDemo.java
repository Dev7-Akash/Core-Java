package core.java.MultiThreading;

import java.util.LinkedList;

public class ProducerAndConsumerDemo {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		final PC pc = new PC();
		 
        // Create producer thread
        Thread producer = new Thread(new Runnable() {
            @Override
            public void run()
            {
                try {
                    pc.produce();
                }
                catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });
 
        // Create consumer thread
        Thread consumer = new Thread(new Runnable() {
            @Override
            public void run()
            {
                try {
                    pc.consume();
                }
                catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });
 
        // Start both threads
        producer.start();
        consumer.start();
 
        // t1 finishes before t2
        producer.join();
        consumer.join();
    }

	}



     class PC {
	 
    // Create a list shared by producer and consumer
    // Size of list is 2.
    LinkedList<Integer> list = new LinkedList<>();
    int capacity = 1;

    // Function called by producer thread
    public void produce() throws InterruptedException
    {
        int value = 0;
        while (value<=10) {
            synchronized (this)
            {
                // producer thread waits while list
                // is full
                while (list.size() == capacity)
                    wait();

                System.out.println("Producer produced-"
                                   + value);

                // to insert the jobs in the list
                list.add(value++);

                // notifies the consumer thread that
                // now it can start consuming
                notify();

                // makes the working of program easier
                // to  understand
                Thread.sleep(1000);
            }
        }
    }

    // Function called by consumer thread
    public void consume() throws InterruptedException
    {
        while (true) {
            synchronized (this)
            {
                // consumer thread waits while list
                // is empty
                while (list.size() == 0)
                    wait();

                // to retrieve the first job in the list
                int val = list.removeFirst();

                System.out.println("Consumer consumed-"
                                   + val);

                // Wake up producer thread
                notify();

                // and sleep
                Thread.sleep(1000);
            }
        }
    }
}
