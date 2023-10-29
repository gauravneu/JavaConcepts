package threadRevision;

public class MyThread7 {

    public static class StoppableRunnable implements Runnable{
        private boolean stopRequested = false;

        //This requestStop() and isStopRequested() methods are synchronized means requestStop or isStopRequested method
        //can only be called by one thread at a time within the same StoppableRunnable interface
        public synchronized void requestStop(){
            this.stopRequested = true;
        }
        public synchronized boolean isStopRequested(){
            return this.stopRequested;
        }

        private void sleep(long millis){
            try{

                //This is main thread not the one we created
                Thread.sleep(millis);
            }catch (InterruptedException e){
                e.printStackTrace();
            }
        }

        @Override
        public void run() {
            System.out.println("StoppableRunnable running");
            while(!isStopRequested()){
                sleep(1000);
                System.out.println("...");
            }
            System.out.println("StoppableRunnable stopped");
        }
    }

    public static void main(String[] args) {
        StoppableRunnable stoppableRunnable = new StoppableRunnable();
        Thread thread1 = new Thread(stoppableRunnable, "The Thread");
        thread1.start();

        try {
            Thread.sleep(5000);
        }catch (InterruptedException e){
            e.printStackTrace();
        }

        System.out.println("requesting Stop");
        stoppableRunnable.requestStop();
        System.out.println("stop requested");
    }
}
