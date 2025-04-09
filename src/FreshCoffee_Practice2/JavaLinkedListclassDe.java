package FreshCoffee_Practice2;
import java.util.LinkedList;
import java.util.Collections;

public class JavaLinkedListclassDe {

    public static void main(String[]args){

        LinkedList<String>cars = new LinkedList<>();
        cars.add("Volvo");
        cars.add("BMW");
        cars.add("Ford");
        cars.add("Mazda");
        cars.add("Volvo");

        System.out.println(cars);
        Collections.sort(cars);

        System.out.println(cars);
        Collections.sort(cars,Collections.reverseOrder());

        System.out.println(cars);

    }
}

//LinkedList vs ArrayList notes
// if need to insert and delete frequently --> use LinkedList
// if need fast access for read the index --> use ArrayList
