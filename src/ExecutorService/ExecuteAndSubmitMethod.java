package ExecutorService;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class ExecuteAndSubmitMethod {
    public static void main(String[] args)
    {
        ExecutorService executor = Executors.newCachedThreadPool();
        //Using execute()
        executor.execute(
                ()->{
                    System.out.println("Task executed using execute()");
                }
        );
        //Using submit();
        Future<String> future = executor.submit(
                ()->{
                    return "Task executed using submit()";
                }
        );
        try{
            System.out.println("Hello " + future.get());
        }
        catch(InterruptedException| ExecutionException e){
            e.printStackTrace();
        }
        executor.shutdown();
    }
}
