package threadRevision;

public class MyThread6 {
    public static void main(String[] args) {

        //Using runnable interface as lambda function
        Runnable runnable = () ->{
            System.out.println("Lambda running");

            try{
                //Static method sleep --> Means being inactive while running
                Thread.sleep(2000);
            }catch (InterruptedException e){
                e.printStackTrace();
            }
            System.out.println("Lambda finishing");
        };
        Thread thread = new Thread(runnable);
        thread.start();
    }
}
