package synchronizedKeyword;
//these two methods can be called by two different threads at same time
public class MixedSynchronization {
    public static Object staticObj = null;

    //it is synchronized on MixedSynchronization class
    public static synchronized void setStaticObj(Object o){
        staticObj = o;
    }

    public Object instanceObj = null;

    //it is synchronized on instanceObj
    public synchronized void setInstanceObj(Object o){
        this.instanceObj = o;
    }
}
