package FreshCoffee_Practice;

public class JavaCMethodDemo {
    public static void main(String []args){

        car c = new car();
        c.carGoing("Your");
        c.car_Speed(500);
        c.car_color("Red");

        System.out.println();

        car LPcar = new car();
        c.carGoing("My");
        LPcar.car_Speed(700);
        LPcar.car_color("Blue and Green");

        cycle cy = new cycle();
        cy.wheelOfCycle();

    }
}


class car {

    void carGoing(String name){
        System.out.println(name + " car is going as fast as it can !");
    }

    void car_Speed(int max_speed){
        System.out.println("Max speed : " + max_speed);
    }

    void car_color(String color){
        System.out.println("the color is : " + color);
    }

}


class cycle{

    int wheel = 2;

    void wheelOfCycle (){
        System.out.printf("There are %d wheel in a cycle",wheel);
    }

}