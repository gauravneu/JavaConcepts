package SynchronizedKeyword;

//two different threads can access two different blocks of same instance at same time

public class MultipleMonitorObjects {
    private Object monitor1 = new Object();
    private Object monitor2 = new Object();

    private int counter1 = 0;
    private int counter2 = 0;

    public void incCounter1(){
        synchronized (monitor1){
            this.counter1++;
        }
    }

    public void incCounter2(){
        synchronized (monitor2){
            this.counter2++;
        }
    }
}
