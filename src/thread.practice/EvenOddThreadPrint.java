package thread.practice;
class Printer
{
    private int count=1;
    private int max;
    Printer(int max)
    {
        this.max=max;
    }
    public synchronized void printEven()
    {
        while (count<=max)
        {
            while (count%2!=0) //wait if count is odd
            {
                try{
                    wait();
                }
                catch(InterruptedException e)
                {
                    Thread.currentThread().interrupt();
                }
            }
            System.out.println("Even: " + count);
            count++;
            notify();
        }
    }
    public synchronized void printOdd()
    {
        while (count<max)
        {
            while (count%2==0) //wait when count is even
            {
                try{
                    wait();
                } catch (InterruptedException e) {
                    Thread.currentThread().interrupt();
                }
            }
            System.out.println("Odd: "+count);
            count++;
            notify();
        }
    }
}
public class EvenOddThreadPrint {
    public static void main(String[] args)
    {
        Printer printer = new Printer(10);
                Thread t1 = new Thread(printer::printEven); //will call printEven method
                Thread t2 = new Thread(printer::printOdd); //will call printOdd method
                t1.start();
                t2.start();

    }
}
