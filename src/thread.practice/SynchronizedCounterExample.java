package thread.practice;
//Create a program where multiple threads are used to access a shared resource (like a counter)
//safely using synchronization.

class Counter
{
    private int count=0;
    //increment method
    public synchronized void increment()
    {
        count++;
        System.out.println(Thread.currentThread().getName() + " incremented count to: " + count);
    }
    public int getCount()
    {
        return count;
    }
}
class WorkerThread extends Thread
{
    private Counter counter;
    //Constructor
    WorkerThread(Counter counter)
    {
        this.counter = counter;
    }
    @Override
    public void run()
    {
        for (int i=0;i<3;i++)
        {
            counter.increment();
            try
            {
                Thread.sleep(100);
            }
            catch (InterruptedException e)
            {
                Thread.currentThread().interrupt();
            }
        }
    }
}
public class SynchronizedCounterExample {
    public static void main(String[] args)
    {
        Counter counter = new Counter();
        Thread t1 = new WorkerThread(counter);
        Thread t2 = new WorkerThread(counter);
        Thread t3 = new WorkerThread(counter);
        Thread t4 = new WorkerThread(counter);
        //Starting the threads
        t1.start();
        t2.start();
        t3.start();
        t4.start();
        //Waiting for threads to finish
        try
        {
            t1.join();
            t2.join();
            t3.join();
            t4.join();
        }
        catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
        System.out.println("Final Counter value: " +counter.getCount());
    }
}
