package thread.practice;

public class ThreadRunnableLambda {
    public static void main(String[] args)
    {
        Runnable task = ()->{
                try {
                    for (int i = 0; i < 5; i++) {
                        System.out.println("Runnable using lambda");
                        Thread.sleep(1000);
                    }
                }
            catch (InterruptedException e)
            {
                e.printStackTrace();
            }
        };
        Thread t = new Thread(task);
        t.start();
    }
}
