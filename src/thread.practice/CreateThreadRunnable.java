package thread.practice;

public class CreateThreadRunnable implements Runnable
{
    @Override
    public void run()
    {
        System.out.println("Thread created by implementing Runnable Interface");
    }
    public static void main(String[] args)
    {
        Thread t = new Thread(new CreateThreadRunnable());
        t.start();
    }
}
