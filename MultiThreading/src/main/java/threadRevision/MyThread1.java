package threadRevision;

public class MyThread1{

    //This class extends Thread class and overwrites run method
    public static class MyThread1Demo extends Thread{
        public void run(){
            System.out.println("My thread running");
            System.out.println("My thread finishing");
        }

        public static void main(String[] args) {
            Thread thread1 = new MyThread1Demo();
            //Use start function to run the thread.
            thread1.start();
        }
    }
}
