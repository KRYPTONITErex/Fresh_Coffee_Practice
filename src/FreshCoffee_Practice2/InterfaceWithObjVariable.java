package FreshCoffee_Practice2;

public class InterfaceWithObjVariable {

    public static void main(String[]args){

//        Machines mac = new Airplane();
//        Machines mac2 = new Ship();
//        mac.start(); mac.stop();
//        mac2.start(); mac2.stop();

//        Machines[] machines = {mac, mac2};
//        for(Machines m : machines){
//            m.start();
//            m.stop();
//        }

        InterfaceWithObjVariable obj = new InterfaceWithObjVariable();
        obj.test(new Airplane());
        obj.test(new Ship());

//        test(new Airplane());
//        test(new Ship());

    }

    public void test(Machines mac){
        mac.start();
        mac.stop();
    }
}

interface Machines{
    void start();
    void stop();
}

class Airplane implements Machines{

    @Override
    public void start() {
        System.out.println("Airplane is starting...");
    }

    @Override
    public void stop() {
        System.out.println("Airplane is landing back to stop...");
    }
}

class Ship implements Machines{

    @Override
    public void start() {
        System.out.println("Ship is starting...");
    }

    @Override
    public void stop() {
        System.out.println("Ship is stopping...");
    }
}

