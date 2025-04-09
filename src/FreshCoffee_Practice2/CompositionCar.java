package FreshCoffee_Practice2;

public class CompositionCar {

    public static void main(String[]args){

       CAR C = new CAR();
       C.moving();

    }
}

class Engine{
    void start(){
        System.out.println("Engine Started...");
    }
}

class CAR{
    Engine engine = new Engine();

    void moving(){
        engine.start();

        System.out.println("Car is Moving fast...");
    }
}