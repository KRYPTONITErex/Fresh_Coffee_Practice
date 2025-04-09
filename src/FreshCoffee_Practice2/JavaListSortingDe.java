package FreshCoffee_Practice2;
import java.util.ArrayList;
import java.util.Collections;

public class JavaListSortingDe {

    public static void main(String[]args){

        ArrayList<String> cars = new ArrayList<String>();
        cars.add("Volvo");
        cars.add("BMW");
        cars.add("Ford");
        cars.add("Mazda");
        cars.add("Honda");

        Collections.sort(cars,Collections.reverseOrder());
//        System.out.println(cars);

        for(String i : cars){
            System.out.println(i);
        }

        ArrayList<Integer> modelYears = new ArrayList<Integer>();
        modelYears.add(2004);
        modelYears.add(2002);
        modelYears.add(2003);
        modelYears.add(2000);

        Collections.sort(modelYears,Collections.reverseOrder());
        for(int i : modelYears){
            System.out.println(i);
        }

    }
}




