package FreshCoffee_Practice2;

public class ThreadConcurrencyProb extends Thread {
    public static int amount = 0;

    public static void main(String[]args){

        ThreadConcurrencyProb tm = new ThreadConcurrencyProb();

        tm.start();
//        System.out.println(amount);
//        amount++;
//        System.out.println(amount);

        while(tm.isAlive()){
            System.out.println("Thread is progressing ... waiting");
        }
        System.out.println("Thread is completed ...");
        System.out.println(amount);
        amount++;
        System.out.println(amount);


    }

    public void run(){
        amount++;
    }
}
