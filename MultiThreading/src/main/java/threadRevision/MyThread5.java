package threadRevision;

public class MyThread5 {
    public static void main(String[] args) {
        Runnable runnable = () ->{
            String threadName = Thread.currentThread().getName();
            System.out.println(threadName+" Starting");
            System.out.println(threadName+" finished");
        };
// When multiple thread start, there is no guarantee of order in which thread will execute their codes
        Thread myThread1 = new Thread(runnable, "Thread 1");
        Thread myThread2 = new Thread(runnable, "Thread 2");
        myThread1.start();
        myThread2.start();
    }
}
