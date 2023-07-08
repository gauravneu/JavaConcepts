package ThreadPackage;

public class RunnableInterfaceWithLambda {
    public static void main(String[] args) {
        Runnable runnable = () -> {
            System.out.println("My Thread Running");
            System.out.println("My Thread Stopped");
        };
        Thread thread = new Thread(runnable);
        thread.start();
    }
}
