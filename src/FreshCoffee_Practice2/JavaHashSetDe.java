package FreshCoffee_Practice2;
import java.util.HashSet;

public class JavaHashSetDe {

    public static void main(String[]args){

        //even though some repeat input , show only one unique when print
        HashSet<String> cars = new HashSet<>();
        cars.add("Volvo");
        cars.add("BMW");
        cars.add("Ford");
        cars.add("Mazda");
        cars.add("Volvo");
        cars.add("Volvo");
        cars.add("Honda");
        cars.add("Nissan");
        cars.add("Nissan");

        System.out.println(cars);
        System.out.println(cars.size());
        System.out.println(cars.contains("BMW"));
        System.out.println(cars.contains("Toyota"));
        cars.remove("Volvo");
        System.out.println(cars);
        System.out.println(cars.size());
//        cars.clear();
//        System.out.println(cars);

        for(String i : cars){
            System.out.print(i + " / ");
        }

    }
}
