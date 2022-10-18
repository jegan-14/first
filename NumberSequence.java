package exp8;
class Sequence implements Runnable 
{

	SeqNumber numbers;
    int reminder;

     Sequence(SeqNumber Num, int index)
     {
        numbers = Num;
        reminder = index;
    }
    @Override
    public void run() 
    {
        numbers.display(this.reminder);
    }
} 
class SeqNumber 
{
    int i = 1;
    int threadCount;
    int max;

    SeqNumber(int threadct, int maxi)
    {
        threadCount = threadct;
        max = maxi;
    }

    void display(int rem)
    {
        synchronized (this)
        {
            while(i < max-1)
            {
                while (i % threadCount != rem)
                {
                    try
                    {
                        wait();
                        Thread.sleep(400);
                    } 
                    catch (InterruptedException e)
                    {
                        e.printStackTrace();
                    }
                }

                System.out.println(Thread.currentThread().getName() + " ---> " + i++);
                notifyAll();
            }
        }
    }
}
public class NumberSequence
{
    static int no=3,maximum=9;

    public static void main(String[] args)
    {
    	SeqNumber obj= new SeqNumber(no, maximum);

        Thread t1 = new Thread(new Sequence(obj, 1), "Thread 1");
        Thread t2 = new Thread(new Sequence(obj, 2), "Thread 2");
        Thread t3 = new Thread(new Sequence(obj, 0), "Thread 3");

        t1.start();
        t2.start();
        t3.start();
    }
}