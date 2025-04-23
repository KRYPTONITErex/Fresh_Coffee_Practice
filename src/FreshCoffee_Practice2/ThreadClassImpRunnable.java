package FreshCoffee_Practice2;

public class ThreadClassImpRunnable implements Runnable {

    public static void main(String[]args){

        ThreadClassImpRunnable tcir = new ThreadClassImpRunnable();
        Thread t = new Thread(tcir);
        t.start();
        System.out.println("This Thread is outside");
    }

    @Override
    public void run() {
        System.out.println("This Thread is inside");
    }
}
