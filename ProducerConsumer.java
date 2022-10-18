package exp8;

class MyThread
{
    int n;
    boolean valueSet = false;
    synchronized int get()
    {
        while(!valueSet)
            try
            {
                wait();
            }
            catch(InterruptedException e)
            {
                System.out.println("InterruptedException caught");
            }
        System.out.println("Got: " + n);
        valueSet = false;
        notify();
        return n;
    }
    synchronized void put(int n)
    {
        while(valueSet)
            try
            {
                wait();
            }
            catch(InterruptedException e)
            {
                System.out.println("InterruptedExceptioncaught");
            }
        this.n = n;
        valueSet = true;
        System.out.println("Put: " + n);
        notify();
    }
}
class Producer implements Runnable
{ MyThread q;
    Producer(MyThread q)
    {
        this.q = q;
        new Thread(this, "Producer").start();
    }
    public void run()
    {
        int i = 0;
        while(i<10)
        {
            q.put(i++);
        }
    }
}
class Consumer implements Runnable
{
	MyThread q;
    Consumer(MyThread q)
    {
        this.q = q;
        new Thread(this, "Consumer").start();
    }
    public void run()
    {
        while(true)
        {
            q.get();
        }
    } }
public class ProducerConsumer
{
    public static void main(String args[])
    {
    	MyThread q = new MyThread();
        new Producer(q);
        new Consumer(q);
        System.out.println("Press Control-C to stop.");
    }
}

