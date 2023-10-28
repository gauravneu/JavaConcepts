package threadPackage;

public class ThreadWithDaemon {
        public static void main(String[] args) {
                Runnable runnable = () -> {
                        while(true){
                                sleep(1000);
                                System.out.println("Running");
                        }
                };
                Thread thread = new Thread(runnable);
                //By making this thread as Daemon thread, now once main thread stops, it will terminate the whole JVM
                //and "thread" will also stop running because it is daemon now, and it depends on main thread.

                //All Daemon threads would stop once main thread terminates

                //Since these daemon threads might stop in middle of code,
                // we need to ensure that they get terminated properly
                thread.setDaemon(true);
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
