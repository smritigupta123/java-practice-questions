package thread.practice;
class CreateThread extends Thread
{
    @Override
    public void run()
    {
        System.out.println("Creating thread using thread class");
    }
    public static void main(String[] args)
    {
        Thread t1 = new CreateThread();
        t1.start();
    }
}

