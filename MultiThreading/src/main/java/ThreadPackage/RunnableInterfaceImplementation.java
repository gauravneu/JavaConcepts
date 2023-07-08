package ThreadPackage;

import javax.swing.plaf.TableHeaderUI;

public class RunnableInterfaceImplementation {
//Implementing Runnable interface here and overwriting run method.
    public static class MyRunnable implements Runnable{
        @Override
        public void run(){
            System.out.println("My Thread Running");
            System.out.println("My Thread Stopped");
        }
    }

    public static void main(String[] args) {
        //creating thread object while providing MyRunnable
        // object and then starting the thread , which triggers run method
        Thread thread = new Thread(new MyRunnable());
        thread.run();
    }
}
