package ThreadPoolExecutorDemo;

import java.util.concurrent.Executors;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public class Demo {
        public static void main(String[] args)
        {
            ThreadPoolExecutor threadPool = new ThreadPoolExecutor(
                    3,
                    5,
                    60,
                    TimeUnit.SECONDS,
                    new LinkedBlockingDeque<>(3),
                    Executors.defaultThreadFactory(),
                    new ThreadPoolExecutor.AbortPolicy()
            );
            for(int i = 0; i<5 ; i++)
            {
                int taskNumber = i;
                threadPool.execute(()->{System.out.println("TaskNumber: " + taskNumber + Thread.currentThread().getName());
                });
            }
            threadPool.shutdown();
        }
}
