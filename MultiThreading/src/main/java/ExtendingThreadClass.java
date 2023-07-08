public class ExtendingThreadClass {


    //Make a subclass of Thread class and overwrite the run method

    //It is not recommended method. Recommended is to use runnable interface implementation
    public static class MyThread extends Thread{
        public void run(){
            System.out.println("My Thread Running");
            System.out.println("My Thread Finished");
        }

        public static void main(String[] args) {
            MyThread myThread = new MyThread();

            //Starting the thread here, it would lead to execution of run method
            myThread.start();
        }
    }
}
