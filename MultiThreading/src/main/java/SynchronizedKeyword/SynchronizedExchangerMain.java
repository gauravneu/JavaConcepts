package SynchronizedKeyword;

public class SynchronizedExchangerMain {
    public static void main(String[] args) {
        SynchronizedExchanger exchanger = new SynchronizedExchanger();
        Thread thread1 = new Thread(
                new Runnable() {
                    @Override
                    public void run() {
                        for(int i=0;i<1000;i++){
                            exchanger.setObject(" "+i);
                        }
                    }
                }
        );


        Thread thread2 = new Thread(
                new Runnable() {
                    @Override
                    public void run() {
                        for(int i=0;i<1000;i++){
                            System.out.println(exchanger.getObject());
                        }
                    }
                }
        );
//Both threads are trying to access same instance, so at a time only one will be able to access that
        thread1.start();
        thread2.start();
    }
}
