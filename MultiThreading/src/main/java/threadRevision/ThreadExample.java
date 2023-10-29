package threadRevision;

public class ThreadExample {
    public static void main(String[] args) {
    //This thread is running  in parallel with main thread.
    //    but this thread is not doing anything.It is just starting and stopping
        Thread thread = new Thread();
        thread.start();
    }
}
