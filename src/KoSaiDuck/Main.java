package KoSaiDuck;

import java.util.ArrayList;

public class Main {
    public static void main(String[]args){

        Animal duck = new Duck("Duck","Donald White");

        ToyBehaviour rubberDuck = new RubberDuck("Rubber Duck","Mr.Rubber Dooby");


        if(rubberDuck instanceof RubberDuck){
            ((RubberDuck) rubberDuck).displayInfo();
        }

        System.out.println();

        if(duck instanceof Duck){
            ((Duck) duck).displayInfo();
            duck.sleeping();
        }

        ArrayList<String> Name = new ArrayList<>();
        Name.add("Donald White");
        Name.add("Mr.Rubber Dooby");
        System.out.println(Name);

    }
}
