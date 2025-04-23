package FreshCoffee_Practice2;

public class RunningInParallelThread implements Runnable{

    public static void main(String[]args){

        RunningInParallelThread rip = new RunningInParallelThread();
        Thread t = new Thread(rip);
        t.start();

    }

    @Override
    public void run() {
        System.out.println("Running in Parallel");
    }
}
