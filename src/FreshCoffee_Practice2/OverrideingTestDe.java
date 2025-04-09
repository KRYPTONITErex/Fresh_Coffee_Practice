package FreshCoffee_Practice2;

public class OverrideingTestDe {
    public static void main(String[]args){

        PassengerCar pc = new PassengerCar();
        pc.drive();

        RaceCarr rc = new RaceCarr();
        rc.drive(); rc.fastestRaceCarr();
    }
}
class Carr{
    void drive(){
        System.out.println("All car can drive as normal task.");
    }
}

class PassengerCar extends Carr{
    @Override
    void drive(){
        super.drive();
        System.out.println("Passenger car can drive fast.");
    }
}
class RaceCarr extends Carr{
    @Override
    void drive(){
        System.out.println("Race car can drive faster than normal car.");
    }
    void fastestRaceCarr(){
        System.out.println("MacLarren is the fastest RaceCarr.");
    }
}