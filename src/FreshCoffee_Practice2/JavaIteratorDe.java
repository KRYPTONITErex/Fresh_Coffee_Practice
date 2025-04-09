package FreshCoffee_Practice2;

import java.util.ArrayList;
import java.util.Iterator;

public class JavaIteratorDe {

    public static void main(String[]args){

        ArrayList<String> cars = new ArrayList<String>();
        cars.add("Volvo");
        cars.add("BMW");
        cars.add("Ford");
        cars.add("Mazda");

        Iterator<String> it = cars.iterator();

        System.out.println(it);
//        System.out.println(it.next());  //print first item only
//        System.out.println(it.next());   //print second item only

        System.out.println("");

        while(it.hasNext()){
            System.out.println(it.next());
        }



    }
}
