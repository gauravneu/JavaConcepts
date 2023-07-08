public class ThreadJoin {
    //We can ensure that one thread waits for other thread
    // to terminate in case we have daemon thread running for more time
    //than main thread

    public static void main(String[] args) {
        Runnable runnable = () -> {
            for(int i= 0; i< 5;i++){
                sleep(1000);
                System.out.println("Running");
            }
        };
        Thread thread = new Thread(runnable);
        thread.setDaemon(true);
        thread.start();

        //Now we can make the main thread to wait for this other thread by using join method

        try{
            //Main thread calling thread.join() on the other thread here
            thread.join();
            //now main thread is blocked until this other thread terminates
        }catch (InterruptedException e){
            e.printStackTrace();
        }



        //Commenting this line will ensure that main thread terminates immediately
        //    sleep(3100);
    }
    public static void sleep(int millis){
        try{
            Thread.sleep(millis);
        }catch (InterruptedException e){
            e.printStackTrace();

        }
    }
}
