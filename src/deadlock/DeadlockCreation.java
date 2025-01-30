package deadlock;

public class DeadlockCreation {
    public static void main(String[] args) {
        final String resource1 = "Resource 1";
        final String resource2 = "Resource 2";
        Thread thread1 = new Thread(() -> {
            synchronized (resource1) {
                System.out.println("Thread1: Locked resource1");
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println("Thread1:Try to lock resource2");
                synchronized (resource2) {
                    System.out.println("Thread1:Locked resource2");
                }
            }
        });
            // Thread 2: Locks resource2 and tries to lock resource1
        Thread thread2 = new Thread(()->{
            synchronized (resource2)
            {
                System.out.println("Thread2:Locked resource2");
                try{
                    Thread.sleep(1000);
                }
                catch(InterruptedException e)
                {
                    e.printStackTrace();
                }
                System.out.println("Thread2:Trying to lock resource1");
                synchronized (resource1)
                {
                    System.out.println("Thread2:Locked resource1");
                }
            }
        });
        thread1.start();
        thread2.start();
    }
}
