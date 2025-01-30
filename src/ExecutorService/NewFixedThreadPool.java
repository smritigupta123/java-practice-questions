package ExecutorService;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class NewFixedThreadPool {
    public static void main(String[] args)
    {
        ExecutorService threadPool = Executors.newFixedThreadPool(4);
        for(int i =1;i<5;i++)
        {
            int taskNumber =i;
            threadPool.execute(()->{
                System.out.println("Task Number: "+ taskNumber + " " +"is running:" + Thread.currentThread().getName());
            });
        }
        threadPool.shutdown();
    }
}
