package FreshCoffee_Practice2;

public class MultiThreading {

    public static void main(String[]args){

        Thread1 t1 = new Thread1();
        Thread2 t2 = new Thread2();

        t1.start();
        t2.start();
    }
}

class Thread1 extends Thread{
    public void run(){
        System.out.println("Thread 1 is running!");
    }
}

class Thread2 extends Thread{
    public void run(){
        System.out.println("Thread 2 is running!");
    }
}