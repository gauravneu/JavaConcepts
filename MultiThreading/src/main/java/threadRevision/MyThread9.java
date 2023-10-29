package threadRevision;

public class MyThread9 {
    public static void main(String[] args) throws InterruptedException {
    //Since we are not making main thread sleep here, it would finish as soon as it starts,
        //and loop will not even complete.
        //To make one thread wait for another(namely main thread here for thread 1), we can use join method.
        Runnable runnable = () ->{

            for(int i=0; i<5; i++){
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println("Running");
            }
        };
        Thread thread = new Thread(runnable);

        thread.setDaemon(true);
        thread.start();



//using this now main thread would terminate only once newly created thread has completed


        //Once main thread reaches here , it sees join, and it waits for thread to complete, once it completes,
        //main thread also completes and then JVM goes down.
        thread.join();

    }
}
