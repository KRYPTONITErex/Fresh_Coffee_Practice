package FreshCoffee_Practice;
public class UpDwnCastingDemo {
    public static void main(String [] args){

        Machine m1 = new Machine();
        myCar myCar = new myCar();
//        myCar.start(); myCar.stop();

        Machine m2 = myCar; //upcasting
//        m2.start(); m2.stop();

        myCar myCar1 = (myCar)m2; //down casting
        myCar1.start();
//        myCar1.start();
//        myCar1.changeGear();

        // Declaring an array of student
        myCar[] arr;
        Machine[]machines;

        machines = new Machine[3];
        machines[0] = new myCar();

        machines[1] = new RedCar();


        // Allocating memory for 2 objects
        // of type student
        arr = new myCar[3];

        // Initializing the first element
        // of the array
        arr[0] = new myCar();

        // Initializing the second element
        // of the array
        arr[1] = new myCar();

        arr[2] = (myCar)m2;

        arr[2].changeGear();

//        machines[0].

    }
}
class Machine{
    void start(){
        System.out.println("machine is starting");
    }
    void stop() {
        System.out.println("machine is stopping");
    }
}

class myCar extends Machine{
//    @Override
    void start(){
        System.out.println("car started");
    }
    @Override
    void stop(){
        System.out.println("car stopped");
    }
    void changeGear(){
        System.out.println("Car can change gear");
    }
}
class RedCar extends Machine{
//    @Override
    void start(){
        System.out.println("car started");
    }
    @Override
    void stop(){
        System.out.println("car stopped");
    }
    void changeHigherGear(){
        System.out.println("Car can change High gear");
    }
}
