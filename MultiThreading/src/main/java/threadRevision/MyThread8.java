package threadRevision;

public class MyThread8 {
    public static void main(String[] args) throws InterruptedException {

        //We need to set thread as daemon.
        //Even if main thread has stopped but if another thread is running it would keep the program alive.
        //To make other thread also terminate once main thread is finished running, we need to set that thread as daemon.
        Runnable runnable = () ->{
            while(true){

                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

                System.out.println("Running");
            }
        };
        Thread thread = new Thread(runnable);
        //by using this line we made new thread as Daemon thread
        //Problem is these thread gets terminated all-of-sudden thus it is important to ensure that when
        //these thread got terminated, they were not in middle of executing some important code
        thread.setDaemon(true);
        thread.start();
        Thread.sleep(3100);
    }
}
