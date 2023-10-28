package synchronizedKeyword;

//even though both methods are synchronized but same thread is trying to access both at same time, there will be no issue.

public class Reentrance {
    private int count = 0;

    public synchronized void inc(){
        this.count++;
    }

    public synchronized int incAndGet(){
        inc();
        return this.count;
    }
}
