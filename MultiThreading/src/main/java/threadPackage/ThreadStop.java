package threadPackage;

public class ThreadStop {
    //Java has a deprecated method called stop(),which should not be used because
    //there will be no idea where in code the thread has stopped and it will
    //leave application at undefined state.

    public static class StoppableRunnable implements Runnable{
        private boolean stopRequested = false;


        //Synchronized means only one thread can call these methods at same time in
        //stoppableRunnable instances
        public synchronized void requestStop(){
            this.stopRequested = true;
        }
        public synchronized boolean isStopRequested(){
            return this.stopRequested;

        }
        private void sleep(int millis){
            try{
                Thread.sleep(millis);
            }catch (InterruptedException e){
                e.printStackTrace();
            }
        }

        @Override
        public void run(){
            System.out.println("Stoppable Runnable Running");
            while(!isStopRequested()){
                sleep(1000);
                System.out.println("I woke up");
            }
            System.out.println("StoppableRunnable stopped");
        }
    }

    public static void main(String[] args) {
        StoppableRunnable stoppableRunnable = new StoppableRunnable();
        Thread thread = new Thread(stoppableRunnable,"The Thread");
        thread.start();

        //This is for main thread, not the one created above
        try{
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }


        System.out.println("Requesting Stop");

        //Stopping using stoppableRunnable, not the thread created above
        stoppableRunnable.requestStop();
        System.out.println("Stop Requested");
    }
}
