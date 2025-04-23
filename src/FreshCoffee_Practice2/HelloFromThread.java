package FreshCoffee_Practice2;

public class HelloFromThread extends Thread{

    public static void main(String[]args){

        HelloFromThread hft = new HelloFromThread();
        hft.start();
    }

    public void run(){
        System.out.println("Hello from Thread");
    }
}
