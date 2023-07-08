public class ThreadSleep {

    //sleep function will make thread wait execution by time given
    public static void main(String[] args) {
        Runnable runnable = () -> {
            System.out.println("My Thread Running");
            try{
                Thread.sleep(200);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("My Thread Stopped");
        };
        Thread thread = new Thread(runnable);
        thread.start();
    }
}
