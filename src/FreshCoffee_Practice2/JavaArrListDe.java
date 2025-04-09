package FreshCoffee_Practice2;
import java.util.ArrayList;
import java.util.Collections;

public class JavaArrListDe {

    public static void main(String[]args){

        ArrayList<String> cars = new ArrayList<String>();
        cars.add("Changan");
        cars.add("BMW");
        cars.add("Volvo");
        cars.add("Audi");
        cars.add("Ford");
        cars.add("Mazda");
        cars.add("Toyota");
        cars.add("Honda");
        System.out.println(cars);

        cars.add(0,"Benz");
        System.out.println(cars);
        cars.add(8,"MacLarren");
        System.out.println(cars);
        cars.set(8,"Geely");
        System.out.println(cars.size());
        System.out.println(cars.get(8));
        cars.remove(5);
        System.out.println(cars);


        ArrayList<Integer> foundedAge = new ArrayList<Integer>();
        foundedAge.add(1995);
        foundedAge.add(1994);
        foundedAge.add(1998);
        System.out.println(foundedAge);

       // Check the type of the element at index 1 in the ArrayList
        System.out.println("Type of foundedAge.get(1): " + foundedAge.get(1).getClass().getName());

        // For primitive types (e.g., int, double), you can simply check the type
        int number = 10;
        System.out.println("Type of number: " + ((Object)number).getClass().getName()); // This won't work for primitive types like int

        for(int i = 0; i<cars.size(); i+=3){
            System.out.println(cars.get(i));
        }

        for(String i : cars){
            System.out.println(i);
        }

        System.out.println("");
        int count = 0;
        for (String car : cars) {
            if (count % 2 == 0) { // Print every second element (0, 2, 4, ...)
                System.out.println(car);
            }
            count++;
        }

        for(int i : foundedAge){
            System.out.println(i);
        }

        Collections.sort(cars);
        System.out.println(cars);

        Collections.sort(foundedAge);
        System.out.println(foundedAge);
    }
}


