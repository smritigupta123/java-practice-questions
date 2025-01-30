package ExecutorService;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class CachedThreadPool {
    public static void main(String[] args)
    {
        ExecutorService executor = Executors.newCachedThreadPool();
        for(int i = 0;i<5;i++)
        {
            int number = i;
            executor.execute(()->{
                System.out.println("Task Number: " + number + " " + "Thread names are: " + Thread.currentThread().getName());
            });
        }
        executor.shutdown();
    }
}
