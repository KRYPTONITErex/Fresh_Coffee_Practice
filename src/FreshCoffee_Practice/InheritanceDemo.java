package FreshCoffee_Practice;

public class InheritanceDemo {
    final int carSteering = 1;

    public static void main(String[]args){

        vehicle v = new vehicle();
//        System.out.println(v.brand);
//        v.honk();

        Acar acr = new Acar();
        System.out.println(acr.modelName);
        acr.carry();
//        acr.honk();
        System.out.println(acr.brand);
        System.out.println(acr.wheel);

        gtGrade spCar = new gtGrade();
        System.out.println(spCar.carName);
        spCar.driveFast();
        spCar.honk();

        int carSteering=2;
        InheritanceDemo inH = new InheritanceDemo();
        System.out.println(inH.carSteering);
    }
}

class vehicle{
    final int wheel = 4;
    String brand = "Toyota";
    void honk(){
        System.out.println("TUU tuu");
    }
}

class Acar extends vehicle{
    String modelName = "ProBox";
    void carry(){
        System.out.println("Can load 5 persons");
    }
}

class gtGrade extends Acar{
    String carName = "GTR";
    int door = 2;
    void driveFast(){
        System.out.println("Can drive upto 180km/hr and has " + door + " doors");
    }
}