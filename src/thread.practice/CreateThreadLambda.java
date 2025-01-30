package thread.practice;

public class CreateThreadLambda {
    public static void main(String[] args)
    {
        Thread t = new Thread(()-> {
            try {
                    for(int i = 0; i<5; i++)
                    {
                        System.out.println("Created thread for running");
                        Thread.sleep(1000);
                    }
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });


        t.setDaemon(true);
        t.start();
        //IllegalThreadStateException- if we are staring the thread without setting it to Daemon
        System.out.println("Made the thread as Daemon");
    }
}
