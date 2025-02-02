package ExecutorService;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

//Implement a task scheduler with a fixed delay between task executions.
class Task implements Runnable
{
    public String taskName;
    public Task(String taskName)
    {
        this.taskName = taskName;
    }
    @Override
    public void run(){
        System.out.println("Executing" + " " + taskName + " " + "at" + " " +  System.currentTimeMillis());
    }
}
public class FixedDelayScheduler {
    public static void main(String[] args)
    {
        ScheduledExecutorService executor = Executors.newScheduledThreadPool(1);
        executor.scheduleWithFixedDelay(new Task("FixedDelayTask"),0,2, TimeUnit.SECONDS);
    }
}
