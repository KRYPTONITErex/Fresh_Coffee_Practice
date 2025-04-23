package FreshCoffee_Practice2;

public class ThreadWithIsAlive extends Thread {
    public static int amount = 0;

    public void run(){
        amount = 42;
    }

    public static void main(String[]args){

        ThreadWithIsAlive tia = new ThreadWithIsAlive();
        tia.start();

        while(tia.isAlive()){
            System.out.println("Thread is progressing ... waiting");
        }
        System.out.println("Final amount: "+amount);

    }
}

