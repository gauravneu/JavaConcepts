package ThreadPackage;

import static java.lang.Thread.sleep;

public class ThreadWithoutDaemon {
    //JVM will keep alive as long as any thread is keep running.
    //Even if main thread terminates and there is another thread keep running,
    //JVM will stay running

    public static void main(String[] args) {
        Runnable runnable = () -> {
          while(true){
              sleep(1000);
              System.out.println("Running");
          }
        };
        Thread thread = new Thread(runnable);

        thread.start();
        //After this sleep, main thread will terminate but custom "thread" will keep on running forever
        sleep(3100);
    }
    public static void sleep(int millis){
        try{
            Thread.sleep(millis);
        }catch (InterruptedException e){
            e.printStackTrace();

        }
    }
}
