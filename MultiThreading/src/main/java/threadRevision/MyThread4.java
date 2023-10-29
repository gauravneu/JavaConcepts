package threadRevision;

public class MyThread4 {
    public static void main(String[] args) {

        //Using runnable interface as lambda function
        Runnable runnable = () ->{
            System.out.println("Lambda running");
            System.out.println("Lambda finishing");
        };
        Thread thread = new Thread(runnable);
        thread.start();
    }
}
