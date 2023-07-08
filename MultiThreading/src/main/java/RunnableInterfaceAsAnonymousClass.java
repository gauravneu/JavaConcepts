public class RunnableInterfaceAsAnonymousClass {
    public static void main(String[] args) {
        Runnable runnable = new Runnable() {
            @Override
            public void run() {
                System.out.println("My Thread Running");
                System.out.println("My Thread Stopped");
            }
        };
        Thread thread = new Thread(runnable);
        thread.start();
    }
}
