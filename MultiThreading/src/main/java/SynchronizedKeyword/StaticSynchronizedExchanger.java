package SynchronizedKeyword;

//monitor object is StaticSynchronizedExchanger class

public class StaticSynchronizedExchanger {
    private static Object object = null;

    public static synchronized void setObject(Object o){
        object = o;
    }

    public static synchronized Object getObject(){
        return object;
    }

    public static synchronized void setObj(Object o){
        synchronized (StaticSynchronizedExchanger.class){
            object = o;
        }
    }

    public static synchronized Object getObj(){
        synchronized (StaticSynchronizedExchanger.class){
            return object;
        }
    }
}
