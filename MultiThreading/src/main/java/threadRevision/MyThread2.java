package threadRevision;

public class MyThread2 {
    public static class MyRunnable implements Runnable{

        @Override
        public void run() {
            System.out.println("MyRunnable starting");
            System.out.println("MyRunnable finishing");
        }


    }
    public static void main(String[] args) {
        MyRunnable myRunnable = new MyRunnable();
        Thread myThread = new Thread(myRunnable);
        myThread.start();
    }
}
