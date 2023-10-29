package threadRevision;

public class MyThread3 {
    public static void main(String[] args) {
        Runnable runnable = new Runnable() {
            @Override
            public void run() {
                System.out.println("MyThread starting");
                System.out.println("MyThread finishing");
            }
        };

        Thread thread = new Thread(runnable);
        thread.start();
    }
}
