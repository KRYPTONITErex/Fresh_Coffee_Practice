package FreshCoffee_Practice2;

public class ThreadClassExtend extends Thread {

    public static void main(String[]args){

        ThreadClassExtend tce = new ThreadClassExtend();
        tce.start();
        System.out.println("This Thread is outside.");

    }

    public void run(){
        System.out.println("This Thread is inside.");
    }
}
