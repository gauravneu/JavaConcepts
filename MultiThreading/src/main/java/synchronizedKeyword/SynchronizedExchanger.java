package synchronizedKeyword;

//instance method means they are not static or class level
// Declaring an instance method as synchronized means only
// one thread can access that method of given instance at a time

//Having more than 1 method synchronized means only one thread can access any method

//non-static uses instance as monitor object

public class SynchronizedExchanger {
    protected Object object = null;

    public synchronized void setObject(Object o){
        this.object = o;
    }

    public synchronized Object getObject(){
        return this.object;
    }

    public void setObj(Object o){
        synchronized (this){
            this.object = o;
        }
    }
    // these synchronized block can be synchronized on any monitor object of choice
    public Object getObj(){
        //this here means that this block is synchronized on this monitor object
        synchronized (this){
            return this.object;
        }
    }
}
