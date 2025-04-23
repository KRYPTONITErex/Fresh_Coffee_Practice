package FreshCoffee_Practice2;

public class ThreadIncrement extends Thread {
    public static int count = 0;

    public void run(){
        for(int i = 0; i <1000 ; i++){
            count++;
        }
    }

    public static void main(String[]args){

        ThreadIncrement tc1 = new ThreadIncrement();
        ThreadIncrement tc2 = new ThreadIncrement();
        tc1.start();
        tc2.start();

        try {
            tc1.join();
            tc2.join();
        }catch (InterruptedException e){
            System.out.println("Thread Interrupted");
        }
        System.out.println("Final Count: " + count);
    }
}
