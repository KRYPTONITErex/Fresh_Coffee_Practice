package FreshCoffee_Practice2;

public class ThreadImpRunnableInterface implements Runnable{

    public void run(){
        System.out.println("Runnable thread is Running ...");
    }

    public static void main(String[]args){
        Thread tm = new Thread(new ThreadImpRunnableInterface());
        tm.start();

    }

}

