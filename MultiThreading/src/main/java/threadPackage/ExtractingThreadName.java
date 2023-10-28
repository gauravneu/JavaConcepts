package threadPackage;

public class ExtractingThreadName {
    //It is possible for runnable to get which thread is currently executing runnable
    //and thus it can get the name of that thread.
    //We can get which thread is running which method in this way
    //In case of multiple thread, you can't guarantee the order of threads
    public static void main(String[] args) {
        Runnable runnable = () ->{
            String threadName = Thread.currentThread().getName();
            System.out.println(threadName + " is running runnable thread");
//            System.out.println("My Thread Running");
//            System.out.println("My Thread Stopped");
        };
     //   String threadName1 = Thread.currentThread().getName();
      //  System.out.println(threadName1 + " is running main function");
        Thread thread = new Thread(runnable, "Thread One");
        thread.start();
        Thread thread2 = new Thread(runnable, "Thread two");
        thread2.start();
    }
}
