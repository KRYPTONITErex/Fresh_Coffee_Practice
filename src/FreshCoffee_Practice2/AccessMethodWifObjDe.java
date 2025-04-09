package FreshCoffee_Practice2;

public class AccessMethodWifObjDe {
    public static void main(String[]args){
        Car car = new Car();
        car.going();
        car.maxSpeed(200);

//        RaceCar racCar = new RaceCar();
//        racCar.going(); racCar.maxSpeed(400); racCar.goFast();

       RaceCar racCar1 = new RaceCar("Yellow");
       racCar1.goFast();

       System.out.println("The race Car color is "+racCar1.getColor());
    }
}
class Car{

    void going(){
        System.out.println("\nThe car is going too fast");
    }

    void maxSpeed(int speed){
        System.out.println("It is going with max speed of "+speed+" km/hr" );
    }

}
class RaceCar extends Car{
    private String Color;
    RaceCar(String Color){
        this.Color = Color;
        System.out.println("\nI like the color with sport cars");
    };

    void goFast(){
        System.out.println("The Race cars are driving way more faster");
    }

    public String getColor(){
        return Color;
    }
}
